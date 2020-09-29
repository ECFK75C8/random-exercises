import './offset.dart';

class HourGlass {
  List<List<int>> array;

  HourGlass(this.array);

  List<int> get hourGlasses {
    var result = <int>[];
    for (var i = 0; i < array.length - 2; i++) {
      for (var j = 0; j < array[0].length - 2; j++) {
        var hourglass = _getHourGlass(i, j);
        result.add(_calSum(hourglass));
      }
    }
    return result;
  }

  int get max {
    var sorted = hourGlasses..sort();
    return sorted.last;
  }

  final _shapeOffsets = [
    [Offset(0, 0), Offset(0, 1), Offset(0, 2)],
    [Offset(1, 1)],
    [Offset(2, 0), Offset(2, 1), Offset(2, 2)]
  ];

  List<List<int>> _getHourGlass(int x, int y) {
    var result = <List<int>>[];
    _shapeOffsets.forEach((offsets) {
      result.add(
          offsets.map((offset) => array[x + offset.x][y + offset.y]).toList());
    });
    return result;
  }

  int _calSum(List<List<int>> hourglass) => hourglass.fold(
      0,
      (prev, element) =>
          prev + element.fold(0, (prev, element) => prev + element));
}

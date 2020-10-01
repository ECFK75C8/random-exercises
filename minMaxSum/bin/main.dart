void main(List<String> arguments) {
  print(minMaxSum([12, 1, 2, 3, 54]));
}

// String minMaxSum(List<int> array) {
//   int total = 0;
//   var sumList = <int>[];
//   for (int i = 0; i < array.length; i++) {
//     for (int j = 0; j < array.length; j++) {
//       total += (i == j) ? 0 : array[j];
//     }
//     sumList.add(total);
//   }
//   sumList.sort();
//   return '${sumList.first} ${sumList.last}';
// }

String minMaxSum(List<int> array) {
  var sumList = <int>[];
  for (var i = 0; i < array.length; i++) {
    sumList.add(
        ([...array]..removeAt(i)).fold(0, (prev, element) => prev + element));
  }
  sumList.sort();
  return '${sumList.first} ${sumList.last}';
}
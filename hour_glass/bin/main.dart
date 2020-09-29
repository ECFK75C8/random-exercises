import './hour_glass.dart';
import 'dart:io';

void main(List<String> args) {
  var arr = List.generate(6, (index) {
    stdout.write('Enter 6 numbers (between -9 to 9) seperated by a space: ');
    var line = stdin.readLineSync();
    return line.split(' ').map((e) => int.parse(e)).toList();
  });
  print(HourGlass(arr).max);
}

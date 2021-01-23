void main(List<String> arguments) {
  print('Hello world!');
}

String maskify(String str) {
  var len = str.length - 5;
  str.splitMapJoin('', onMatch: (match) => '*');
  return '';
}

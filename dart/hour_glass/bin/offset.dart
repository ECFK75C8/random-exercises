class Offset {
  int x;
  int y;

  Offset(this.x, this.y);

  @override
  bool operator ==(Object other) =>
      other is Offset && other.x == x && other.y == y;

  @override
  String toString() {
    return '($x, $y)';
  }

  @override
  int get hashCode {
    final prime = 5;
    var result = 1;
    result = prime * result + x;
    result = prime * result + y;
    return result;
  }
}
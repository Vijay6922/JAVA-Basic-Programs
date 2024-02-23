package oop2;
public class BitOperators {
public static void main(String[] args) {
byte a = 10, b = 15;
// 0000 1010 & 0000 1111 = 0000 1010

System.out.printf("%d & %d = %d\n", a, b, a & b);

// 0000 1010 | 0000 1111 = 0000 1111

System.out.printf("%d | %d = %d\n", a, b, a | b);

// 0000 1010 >> 2

System.out.printf("%d >> 2 = %d\n", a, a >> 2);

// 0000 1010 << 2


System.out.printf("%d << 2 = %d\n", a, a << 2);
} }
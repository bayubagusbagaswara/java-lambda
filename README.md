# 6th Learning Path Java : Java Lambda

# Techologies

- Java JDK 17
- Create project https://start.spring.io/

# Agenda

- Pengenalan Lambda
- Membuat Lambda
- Java Function
- Method Reference
- dan lain-lain

# Apa itu Lambda?

- Lambda berasal dari `lambda calculus`, yang mengacu pada `anonymous function` (function tanpa nama)
- Tetapi di Java function atau method tidak bisa berdiri sendiri
- Jadi kemungkinan pada praktiknya, lambda di Java dan di bahasa pemrograman lain akan berbeda

# Anonymous Class

- Di Java kita hanya mengenal Anonymous Class
- Lambda di Java sebenarnya adalah versi sederhana membuat sebuah anonymous class

# Syarat Lambda

- Berupa `interface`
- Memiliki 1 method abstract
- Ditambahkan annotation `@FunctionalInterface` di interface-nya
- Minimal menggunakan Java 8

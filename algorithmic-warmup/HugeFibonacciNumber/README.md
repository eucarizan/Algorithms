# Huge Fibonacci Number

## Description
Compute the _n_-th Fibonacci number modulo _m_
- **Input:** Integers _n_ and _m_
- **Output:** Fn mod _m_
- **Constraints:** 1 <= n <= 10^4, 2 <= m <= 10^3

## Examples
**Sample Input 1:**
```console
1 239
```

**Sample Output 1:**
```console
1
// F(1) mod 239 -> 1 mod 239 = 1
```

**Sample Input 2:**
```console
115 1000
```

**Sample Output 2:**
```console
885
// f(115) mod 1000 -> 483 162 952 612 010 163 284 885 mod 1000 = 885
```

**Sample Input 3:**
```console
2816213588 239
```

**Sample Output 3:**
```console
151
// f(2816213588) mod 239 = 151
```

**Sample Input 4:**
```console
10 2
```

**Sample Output 4:**
```console
1
```

**Sample Input 5:**
```console
10 3
```

**Sample Output 5:**
```console
1
```

## Tags
- algorithmic warm up

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)
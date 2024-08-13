public class main {

    public static void main(String[] args) {
        System.out.println("Fatorial: " + calcularFatorial(5));
        System.out.println("Somatório até N: " + calcularSomatorio(10));
        System.out.println("Fibonacci: " + calcularFibonacci(6));
        System.out.println("Somatório entre K e J: " + calcularSomatorioEntre(3, 7));
        System.out.println("Palíndromo: " + verificarPalindromo("radar"));
    }

    // Fatorial de n: n! = n * (n-1) * (n-2) * ... * 1
    // Recursão: fatorial(n) = n * fatorial(n-1) | Base: fatorial(0) = 1
    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    // Somatório até N: somatório(n) = n + (n-1) + ... + 1
    // Recursão: somatorio(n) = n + somatorio(n-1) | Base: somatorio(0) = 0
    public static int calcularSomatorio(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + calcularSomatorio(n - 1);
        }
    }

    // Sequência de Fibonacci: fib(n) = fib(n-1) + fib(n-2)
    // Base: fib(0) = 0, fib(1) = 1
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    // Somatório entre K e J: somatório(k, j) = k + (k+1) + ... + j
    // Recursão: somatorio(k, j) = j + somatorio(k, j-1) | Base: j < k => 0
    public static int calcularSomatorioEntre(int k, int j) {
        if (j < k) {
            return 0;
        } else {
            return j + calcularSomatorioEntre(k, j - 1);
        }
    }

    // Verifica se uma string é palíndromo
    // Recursão: palindromo(s) = s[i] == s[j] && palindromo(s, i+1, j-1) | Base: i >= j
    public static boolean verificarPalindromo(String s) {
        return verificarPalindromo(s, 0, s.length() - 1);
    }

    private static boolean verificarPalindromo(String s, int i, int j) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }
        return verificarPalindromo(s, i + 1, j - 1);
    }
}

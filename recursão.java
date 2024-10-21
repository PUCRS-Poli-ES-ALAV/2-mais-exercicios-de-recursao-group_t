
import java.util.ArrayList;

public class recursão {

    public static void main(String[] args) {

        System.out.println("Fatorial: " + calcularFatorial(5));
        System.out.println("Somatório até N: " + calcularSomatorio(10));
        System.out.println("Fibonacci: " + calcularFibonacci(6));
        System.out.println("Somatório entre K e J: " + calcularSomatorioEntre(3, 7));
        System.out.println("Palíndromo: " + verificarPalindromo("radar"));
        System.out.println("Conversor de binário: " + convBase2(10));
        System.out.println("Número de dígitos: " + nroDigit(12345)); 
        System.out.println("Verificador de 'substring': " + findSubStr("substring", "sub"));
        System.out.println("Permutações de 'abc': " + permutations("abc"));

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        System.out.println("Somatório da lista: " + sumArrayList(new ArrayList<>(lista))); 
        System.out.println("Maior número da lista: " + findBiggest(new ArrayList<>(lista))); 

    
        
    }

    // 1. Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.
    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }

    // 2. Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.
    public static int calcularSomatorio(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + calcularSomatorio(n - 1);
        }
    }

    // 3. Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.
    public static int calcularFibonacci(int n) {
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        };
    }

    // 4. Modele e implemente um método recursivo que calcule o somatório dos números inteiros entre os números k e j, passados como parâmetro.
    public static int calcularSomatorioEntre(int k, int j) {
        if (j < k) {
            return 0;
        } else {
            return j + calcularSomatorioEntre(k, j - 1);
        }
    }

    // 5. Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.
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

    // 6. Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.
    public static String convBase2(int n) {
        return 
        
        switch (n) {
          case 0 -> "0";
          case 1 -> "1";
          default -> convBase2(n / 2) + (n % 2);
          
        };
    }

    // 7. Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
    public static int sumArrayList(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            return 0;
        } else {
            int first = arr.remove(0);
            return first + sumArrayList(arr);
        }
    }

    // 8. Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.
    public static int findBiggest(ArrayList<Integer> arr) {
        if (arr.size() == 1) {
            return arr.get(0);
        } else {
            int first = arr.remove(0);
            int biggestRest = findBiggest(arr);
            return Math.max(first, biggestRest);
        }
    }

    // 9. Implemente um método recursivo para determinar se um string ocorre dentro de outro.
    public static boolean findSubStr(String str, String match) {
        if (str.length() < match.length()) {
            return false;
        } else if (str.startsWith(match)) {
            return true;
        } else {
            return findSubStr(str.substring(1), match);
        }
    }

    // 10. Faça um método recursivo que determina o número de dígitos de um inteiro.
    public static int nroDigit(int n) {
        if (n == 0) {
            return 0;
        } else {
            return 1 + nroDigit(n / 10);
        }
    }

    // 11. Implemente um métodos que recebe um String e retorna um ArrayList com todas as permutações deste String.
    public static ArrayList<String> permutations(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s.length() == 1) {
            result.add(s);
            return result;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char fixed = s.charAt(i);
                String rest = s.substring(0, i) + s.substring(i + 1);
                for (String perm : permutations(rest)) {
                    result.add(fixed + perm);
                }
            }
            return result;
        }
    }
}

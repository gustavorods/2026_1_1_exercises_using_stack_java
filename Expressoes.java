import java.util.*;

public class Expressoes {

    // ===============================
    // 1. Avaliação de expressão prefixa
    // ===============================
    public static int avaliarPrefixa(String expr) {
        Stack<Integer> pilha = new Stack<>();
        String[] tokens = expr.split(" ");

        for (int i = tokens.length - 1; i >= 0; i--) {
            String t = tokens[i];

            if (t.matches("-?\\d+")) {
                pilha.push(Integer.parseInt(t));
            } else {
                int a = pilha.pop();
                int b = pilha.pop();

                switch (t) {
                    case "+": pilha.push(a + b); break;
                    case "-": pilha.push(a - b); break;
                    case "*": pilha.push(a * b); break;
                    case "/": pilha.push(a / b); break;
                    case "^": pilha.push((int)Math.pow(a, b)); break;
                }
            }
        }
        return pilha.pop();
    }

    // ===============================
    // 2 e 5. Infixa → Pós-fixa
    // ===============================
    public static String infixaParaPosfixa(String expr) {
        StringBuilder saida = new StringBuilder();
        Stack<Character> pilha = new Stack<>();

        Map<Character, Integer> prioridade = new HashMap<>();
        prioridade.put('+', 1);
        prioridade.put('-', 1);
        prioridade.put('*', 2);
        prioridade.put('/', 2);
        prioridade.put('^', 3);

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                saida.append(c);
            } else if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    saida.append(pilha.pop());
                }
                pilha.pop();
            } else {
                while (!pilha.isEmpty() &&
                       prioridade.containsKey(c) &&
                       prioridade.getOrDefault(pilha.peek(), 0) >= prioridade.get(c)) {
                    saida.append(pilha.pop());
                }
                pilha.push(c);
            }
        }

        while (!pilha.isEmpty()) {
            saida.append(pilha.pop());
        }

        return saida.toString();
    }

    // ===============================
    // 3. Avaliação pós-fixa
    // ===============================
    public static int avaliarPosfixa(String expr) {
        Stack<Integer> pilha = new Stack<>();
        String[] tokens = expr.split(" ");

        for (String t : tokens) {
            if (t.matches("-?\\d+")) {
                pilha.push(Integer.parseInt(t));
            } else {
                int b = pilha.pop();
                int a = pilha.pop();

                switch (t) {
                    case "+": pilha.push(a + b); break;
                    case "-": pilha.push(a - b); break;
                    case "*": pilha.push(a * b); break;
                    case "/": pilha.push(a / b); break;
                    case "^": pilha.push((int)Math.pow(a, b)); break;
                }
            }
        }
        return pilha.pop();
    }

    // ===============================
    // MAIN
    // ===============================
    public static void main(String[] args) {

        // 1
        String prefixa = "+ - * 2 3 5 / ^ 2 3 4";
        System.out.println("1) Resultado prefixa: " + avaliarPrefixa(prefixa));

        // 2
        String infixa2 = "((x+y)^2)+((x-4)/3)";
        System.out.println("2) Pós-fixa: " + infixaParaPosfixa(infixa2));

        // 3
        String posfixa = "7 2 3 * - 4 9 ^ 3 / +";
        System.out.println("3) Resultado pós-fixa: " + avaliarPosfixa(posfixa));

        // 4 (manual - lógica proposicional)
        System.out.println("4) Pré-fixa: ↔ ¬ ∧ p q ∨ ¬ p ¬ q");
        System.out.println("   Pós-fixa: p q ∧ ¬ p ¬ q ∨ ↔");

        // 5
        System.out.println("5a) " + infixaParaPosfixa("(5*8-4)+3"));
        System.out.println("5b) " + infixaParaPosfixa("((a+b)*c)+(((d/e)-f)*g)"));
    }
}

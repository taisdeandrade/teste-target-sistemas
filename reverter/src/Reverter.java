public class Reverter {
    public static void main(String[] args) {
        String entrada = "Refrigerador";
        char[] novo = entrada.toCharArray();

        
        int x = entrada.length() - 1;
        for(int i = 0; i <= x; i++)
        {
            char troca = entrada.toCharArray()[x - i];
            novo[i] = troca;
            
        }
        System.out.println(novo);
    }

}

package virado.no.jiray.introducao;

public class Aula08ArraysMultidimensionais03 {
    public static void main(String[] args) {
        String[][] arrayS = {{"A", "B"},{"C","D","E"},{"F","G","H","I","J"}};
        String[][] array2 = new String[3][];
        String[] arrayStrings= {"A", "B"};
        array2[0] = arrayStrings;
        array2[1] = new String[]{"C","D","E"};
        array2[2] = new String[]{"F","G","H","I","J"};

        for (String[] arrayBase: array2){
            System.out.println("\n------------");
            for (String letra: arrayBase){
                System.out.print(letra + " ");
            }
        }
    }
}

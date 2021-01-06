//Author: Lucas Coutinho de Almeida
package railfencecipher;

public class RailFenceCipher {

    public static void main(String[] args) {
        String plainText = "lucas";
        int rail = 2;
        char[] splitPlaintText = plainText.toCharArray();
        char[][] encryptedMatrix = new char[rail][plainText.length()];

        switch (rail) {
            case 2:
                for (int line = 0; line < rail; line++) { //For 2 rails
                    for (int column = 0; column < plainText.length(); column++) {
                        if (line == column) {
                            encryptedMatrix[line][column] = splitPlaintText[column];
                        }
                        if (line == 0 && column % 2 == 0) {
                            encryptedMatrix[line][column] = splitPlaintText[column];
                        }
                        if (line == 1 && column % 2 != 0) {
                            encryptedMatrix[line][column] = splitPlaintText[column];
                        }
                    }
                }
            break;
        }
    }

}

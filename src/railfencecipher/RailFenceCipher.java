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
            case 3:
                int aux = 0;
                int aux2 = 1;
                int aux3 = 2;
                for (int line = 0; line < rail; line++) {
                    for (int column = 0; column < plainText.length(); column++) {
                        if (line == 0 && aux < plainText.length()) {
                            encryptedMatrix[line][aux] = splitPlaintText[aux];
                            aux += 4;
                        }
                        if (line == 1 && aux2 < plainText.length()) {
                            encryptedMatrix[line][aux2] = splitPlaintText[aux2];
                            aux2 += 2;
                        }
                        if (line == 2 && aux3 < plainText.length()) {
                            encryptedMatrix[line][aux3] = splitPlaintText[aux3];
                            aux3 += 4;
                        }
                    }
                }
                break;
        }
    }

}

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
            case 4:
                int a = 0,
                 b = 1,
                 c = 2,
                 d = 3;
                for (int line = 0; line < rail; line++) {
                    for (int column = 0; column < plainText.length(); column++) {
                        if (line == 0 && a < plainText.length()) {
                            encryptedMatrix[line][a] = splitPlaintText[a];
                            a += 6;
                        }
                        if (line == 1 && b < plainText.length()) {
                            encryptedMatrix[line][b] = splitPlaintText[b];
                            switch (b) {
                                case 5:
                                case 11:
                                case 17:
                                case 23:
                                case 29:
                                case 35:
                                case 41:
                                    b += 2;
                                    break;
                                default:
                                    b += 4;
                                    break;
                            }
                        }
                        if (line == 2 && c < plainText.length()) {
                            encryptedMatrix[line][c] = splitPlaintText[c];
                            switch (c) {
                                case 4:
                                case 10:
                                case 16:
                                case 22:
                                case 28:
                                case 34:
                                case 40:
                                    c += 4;
                                    break;
                                default:
                                    c += 2;
                                    break;
                            }
                        }
                        if (line == 3 && d < plainText.length()) {
                            encryptedMatrix[line][d] = splitPlaintText[d];
                            d += 6;
                        }
                    }
                }
                break;
            case 5:
                int e = 0,
                 f = 1,
                 g = 2,
                 h = 3, 
                 i = 4;
                for (int line = 0; line < rail; line++) {
                    for (int column = 0; column < plainText.length(); column++) {
                        if (line == 0 && e < plainText.length()) {
                            encryptedMatrix[line][e] = splitPlaintText[e];
                            e += 8;
                        }
                        if (line == 1 && f < plainText.length()) {
                            encryptedMatrix[line][f] = splitPlaintText[f];
                            switch (f) {
                                case 7:
                                case 15:
                                case 23:
                                case 31:
                                case 39:
                                    f += 2;
                                    break;
                                default:
                                    f += 6;
                                    break;
                            }
                        }
                        if (line == 2 && g < plainText.length()) {
                            encryptedMatrix[line][g] = splitPlaintText[g];
                            g += 4;
                        }
                        if (line == 3 && h < plainText.length()) {
                            encryptedMatrix[line][h] = splitPlaintText[h];
                            switch (h) {
                                case 5:
                                case 13:
                                case 21:
                                case 29:
                                case 37:
                                    h += 6;
                                    break;
                                default:
                                    h += 2;
                                    break;
                            }
                        }
                        if (line == 4 && i < plainText.length()) {
                            encryptedMatrix[line][i] = splitPlaintText[i];
                            i += 8;
                        }
                    }
                }
        }
    }

}

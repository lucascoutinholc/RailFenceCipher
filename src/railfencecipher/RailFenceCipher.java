//Author: Lucas Coutinho de Almeida
package railfencecipher;

public class RailFenceCipher {

    public static void main(String[] args) {
        String plainText = "pneumoultramicroscopicossilicovulcanoconiótico";
        int rail = 5;
        char[] splitPlaintText = plainText.toCharArray();
        char[][] encryptedMatrix = new char[rail][plainText.length()];

        int aux = 0,
                aux2 = 1,
                aux3 = 2,
                aux4 = 3,
                aux5 = 4;
        String encryptedPlainText = "";
        switch (rail) {
            case 2:
                for (int line = 0; line < rail; line++) {
                    for (int column = 0; column < plainText.length(); column++) {
                        if (line == 0 && aux < plainText.length()) {
                            encryptedMatrix[line][aux] = splitPlaintText[aux];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux]);
                            aux += 2;
                        }
                        if (line == 1 && aux2 < plainText.length()) {
                            encryptedMatrix[line][aux2] = splitPlaintText[aux2];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux2]);
                            aux2 += 2;
                        }
                    }
                }
                break;
            case 3:
                for (int line = 0; line < rail; line++) {
                    for (int column = 0; column < plainText.length(); column++) {
                        if (line == 0 && aux < plainText.length()) {
                            encryptedMatrix[line][aux] = splitPlaintText[aux];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux]);
                            aux += 4;
                        }
                        if (line == 1 && aux2 < plainText.length()) {
                            encryptedMatrix[line][aux2] = splitPlaintText[aux2];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux2]);
                            aux2 += 2;
                        }
                        if (line == 2 && aux3 < plainText.length()) {
                            encryptedMatrix[line][aux3] = splitPlaintText[aux3];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux3]);
                            aux3 += 4;
                        }
                    }
                }
                break;
            case 4:
                for (int line = 0; line < rail; line++) {
                    for (int column = 0; column < plainText.length(); column++) {
                        if (line == 0 && aux < plainText.length()) {
                            encryptedMatrix[line][aux] = splitPlaintText[aux];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux]);
                            aux += 6;
                        }
                        if (line == 1 && aux2 < plainText.length()) {
                            encryptedMatrix[line][aux2] = splitPlaintText[aux2];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux2]);
                            switch (aux2) {
                                case 5:
                                case 11:
                                case 17:
                                case 23:
                                case 29:
                                case 35:
                                case 41:
                                    aux2 += 2;
                                    break;
                                default:
                                    aux2 += 4;
                                    break;
                            }
                        }
                        if (line == 2 && aux3 < plainText.length()) {
                            encryptedMatrix[line][aux3] = splitPlaintText[aux3];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux3]);
                            switch (aux3) {
                                case 4:
                                case 10:
                                case 16:
                                case 22:
                                case 28:
                                case 34:
                                case 40:
                                    aux3 += 4;
                                    break;
                                default:
                                    aux3 += 2;
                                    break;
                            }
                        }
                        if (line == 3 && aux4 < plainText.length()) {
                            encryptedMatrix[line][aux4] = splitPlaintText[aux4];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux4]);
                            aux4 += 6;
                        }
                    }
                }
                break;
            case 5:
                for (int line = 0; line < rail; line++) {
                    for (int column = 0; column < plainText.length(); column++) {
                        if (line == 0 && aux < plainText.length()) {
                            encryptedMatrix[line][aux] = splitPlaintText[aux];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux]);
                            aux += 8;
                        }
                        if (line == 1 && aux2 < plainText.length()) {
                            encryptedMatrix[line][aux2] = splitPlaintText[aux2];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux2]);
                            switch (aux2) {
                                case 7:
                                case 15:
                                case 23:
                                case 31:
                                case 39:
                                    aux2 += 2;
                                    break;
                                default:
                                    aux2 += 6;
                                    break;
                            }
                        }
                        if (line == 2 && aux3 < plainText.length()) {
                            encryptedMatrix[line][aux3] = splitPlaintText[aux3];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux3]);
                            aux3 += 4;
                        }
                        if (line == 3 && aux4 < plainText.length()) {
                            encryptedMatrix[line][aux4] = splitPlaintText[aux4];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux4]);
                            switch (aux4) {
                                case 5:
                                case 13:
                                case 21:
                                case 29:
                                case 37:
                                    aux4 += 6;
                                    break;
                                default:
                                    aux4 += 2;
                                    break;
                            }
                        }
                        if (line == 4 && aux5 < plainText.length()) {
                            encryptedMatrix[line][aux5] = splitPlaintText[aux5];
                            encryptedPlainText += String.valueOf(encryptedMatrix[line][aux5]);
                            aux5 += 8;
                        }
                    }
                }
        }
        System.out.println("Encrypted plain text: " + encryptedPlainText);
    }

}

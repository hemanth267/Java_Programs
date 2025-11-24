public class ConversionOfHexaDecimalToBinary {
    public static void main(String[] args) {
        String hexString = "1fa2d";
        // Integer.toHexString(0)--> base-16
        // Integer.toBinaryString(0)--> base-2
        // Integer.toOctalString(0)--> base-8
        int decimalValue = Integer.parseInt(hexString, 16);
        String binaryString = Integer.toBinaryString(decimalValue);
        System.out.println("Hexadecimal: " + hexString);
        System.out.println("Binary     : " + binaryString);
    }
}
//output:
// Hexadecimal: 1fa2d
// Binary     : 11111101000101101
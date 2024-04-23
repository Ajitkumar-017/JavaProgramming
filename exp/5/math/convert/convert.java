package math.convert;
public class convert {

    public static class DecimalToOctal {
        public DecimalToOctal(int decimal) {
            System.out.println(decimal + " in Octal = " + Integer.toOctalString(decimal));
        }
    }

    public static class BinaryToHex {
        public BinaryToHex(long binary) {
            System.out.println(binary + " in Hex = " + Long.toHexString(binary));
        }
    }

    public static class OctalToDecimal {
        public OctalToDecimal(String octal) {
            System.out.println(octal + " in Decimal = " + Integer.parseInt(octal, 8));
        }
    }

    public static class HexToBinary {
        public HexToBinary(String hex) {
            System.out.println(hex + " in Binary = " + Long.toBinaryString(Long.parseLong(hex, 16)));
        }
    }
}

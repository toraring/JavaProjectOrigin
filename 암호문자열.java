package object;

public class 암호문자열 {
	public static void main(String[] args) {
		String s = "g fmnc wms bgblr rpylqjyrc gr zw fylb. rfyrq ufyr amknsrcpq ypc dmp. bmgle gr gl zw fylb gq glcddgagclr ylb rfyr'q ufw rfgq rcvr gq qm jmle. sqgle qrpgle.kyicrpylq() gq pcamkkclbcb. lmu ynnjw ml rfc spj.\r\n"; 
		int length = s.length();
		for(int i = 0; i < length; i++) {
			char c = s.charAt(i);
			char c2 = (char)(c + 2);
			System.out.print(c2);
}
				
	}
}

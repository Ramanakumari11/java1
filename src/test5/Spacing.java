package test5;

public class Spacing {

	public static void main(String[] args) {
		String str = "Birds_are_flying___in__the_sky";
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == '_' && str.charAt(i) == '_') {

				StringBuffer sb = new StringBuffer(str);
				str = sb.replace(i - 1, i, "").toString();
				i = i - 1;

			}

		}
		System.out.println(str);

	}

}

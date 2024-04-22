package pru_JSE_0001;

public class CUtils {
	public static boolean isP(char[] cAr, int iPos, int fPos, boolean seg)  { 			
		if (fPos-iPos ==0) { 
			seg = false;
			return true; 
		}else if (fPos-iPos==1) { 
			seg = false;
			return (cAr[iPos]==cAr[fPos]); 
		}else {
			if (seg) { 
				if (cAr[iPos]!=cAr[fPos]) {
					seg = false;
					return false; 
				} else {
					return isP(cAr,++iPos, --fPos,true); 
				}		
			}else {			
				seg = false;	 
				return false; 
			}
		} 
	}
	
}

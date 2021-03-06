package ass2.spec;

public class MathUtil {
	public static float[] crossProduct(float[] v1, float[] v2){		
		float[] val = new float[3];
		val[0] = v1[1] * v2[2] - v1[2] * v2[1];
		val[1] = v1[2] * v2[0] - v1[0] * v2[2];
		val[2] = v1[0] * v2[1] - v1[1] * v2[0];
		return val;		
	}
	
	public static float[] normalise(float[] v){
		float length = (float) Math.sqrt(v[0]*v[0] + v[1]*v[1] + v[2]*v[2]);
		float val[] = {v[0]/length,v[1]/length,v[2]/length};
		return val;
	}
	
	public static float[] add(float[]v1, float[]v2){
		float[] val = new float[3];
		val[0] = v1[0] + v2[0];
		val[1] = v1[1] + v2[1];
		val[2] = v1[2] + v2[2];
		return val;	
	}
	
	public static float[] sub(float[]v1, float[]v2){
		float[] val = new float[3];
		val[0] = v1[0] - v2[0];
		val[1] = v1[1] - v2[1];
		val[2] = v1[2] - v2[2];
		return val;	
	}
	
	public static float[] scale(float[]v1, float scale){
		float[] val = new float[3];
		val[0] = v1[0] * scale;
		val[1] = v1[1] * scale;
		val[2] = v1[2] * scale;
		return val;	
	}
}

class Graphics{
	double[] sines;
	double[] cosines;
	
	{
		sines = new double[360];
		cosines = new double[sines.length];
		for(int degree = 0; degree < sines.length; degree++){
			sines[degree] = Math.sin(Math.toRadians(degree));
			cosines[degree] = Math.cos(Math.toRadians(degree));
		}
	}
}
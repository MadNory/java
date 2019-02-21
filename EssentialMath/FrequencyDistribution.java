public class FrequencyDistribution
{
	private static final long SAMPLES = 50000000;
	private static final int POINTS = 80;
	private	int[] dist = new int[POINTS];
	
	public FrequencyDistribution()
	{
		for(int i = 0; i < POINTS; ++i){
			this.dist[i] = 0;
		}
	}	// intialize the contents of the array

	
	public static void main(String[] args)
	{
		FrequencyDistribution fd = new FrequencyDistribution();
		generateSamples(fd);
		printDistribution(fd);
	}	// main()
	
	
	private static void generateSamples(FrequencyDistribution freqDist)
	{
		int sample = 0, x = 40;
		
		for(int i = 0; i < SAMPLES; ++i)
		{
			sample = (int)(100 * Math.random() + 1);
			
			if ((sample > 89) || (sample < 10))
			{
				x = 40;		// reset x if sample is outside boundaries
			}
			
			if(sample > 50)
			{
				++x;
			}else{
				--x;
			}
			
			++freqDist.dist[x];
		}	// 
	}	// generateSamples()
	
	
	private static void printDistribution(FrequencyDistribution freqDist)
	{
		for (int i = 0; i < POINTS; ++i)
		{
			System.out.println("[" + i + "] = " + freqDist.dist[i]);
		}
	}	// printDistribution()
}
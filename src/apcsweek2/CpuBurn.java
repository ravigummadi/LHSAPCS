package apcsweek2;

public class CpuBurn {
	
	public static void main(String[] args){
		for(int i=0; i < 10; i++){
			Thread t = new Thread(new Runnable() {				
				@Override
				public void run() {
					while (true){ double x = Math.random() * Math.random();}					
				}
			});
			t.run();
		}
		
		try {
			Thread.sleep(72000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

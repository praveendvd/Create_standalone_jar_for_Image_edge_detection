package test_suites;

import java.io.File;
import java.io.IOException;

import org.openimaj.image.ImageUtilities;
import org.openimaj.image.MBFImage;
import org.openimaj.image.processing.edges.CannyEdgeDetector;

public class entry {

	public static void main(String[] args) throws IOException {
		
		MBFImage image= null;
		
		if(args.length!=0) {
		 image = ImageUtilities.readMBF(new File(args[0]));
		};
		// detect the edges using canny
		image.processInplace(new CannyEdgeDetector());
		
		ImageUtilities.write(image, new File("2.png"));

	}

}

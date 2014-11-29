package dlx;


/**
 * DLX Algorithm Configuration
 * @author Deyuan Guo, Dawei Fan
 */
public class DLXConfig {

	/******************** Public Member Variables ********************/

	/** The character for splitting tiles */
	public final char S = ' ';

	/** The debug information switch */
	public boolean verb = true;

	/******************** Private Member Variables ********************/

	/** Enable spin of tiles or not. */
	private boolean enableSpin = false;

	/** Enable spin of tiles or not. */
	private boolean enableSpinFlip = false;

	/** Enable spin of tiles or not, this is set by compare area. */
	private boolean enableExtra = false;

	/** Directly Fail */
	private boolean directlyFail = false;

	/** Search Finished */
	private boolean searchFinished = false;

	/** Single step search */
	private boolean singleStepSearch = false;

	/** Single step search */
	private boolean singleSolutionSearch = false;

	/******************** Public Member Functions ********************/

	public DLXConfig() {
	}

	/**
	 * Reset the configuration before every new process.
	 */
	public void reset(){
//		enableSpin = false;
//		enableSpinFlip = false;
//		enableExtra = false;
		directlyFail = false;
		searchFinished = false;
		singleStepSearch = false;
		singleSolutionSearch = false;
	}

	public boolean isEnableSpin() { return enableSpin; }
	public void setEnableSpin(boolean b) { enableSpin = b; }

	public boolean isEnableSpinFlip() { return enableSpinFlip; }
	public void setEnableSpinFlip(boolean b) { enableSpinFlip = b; }

	public boolean isEnableExtra() { return enableExtra; }
	public void setEnableExtra(boolean b) { enableExtra = b; }

	public boolean isDirectlyFail() { return directlyFail; }
	public void setDirectlyFail(boolean b) { directlyFail = b; }

	public boolean searchFinished() { return searchFinished; }
	public void setSearchFinished(boolean b) { searchFinished = b; }

	public boolean singleStepSearch() { return singleStepSearch; }
	public void setSingleStepSearch(boolean b) { singleStepSearch = b; }

	public boolean singleSolutionSearch() { return singleSolutionSearch; }
	public void setSingleSolutionSearch(boolean b) { singleSolutionSearch = b; }

	public void print() {
		System.out.println("DLXConfig Class:");
		System.out.println("Spin = " + enableSpin);
		System.out.println("Spin/Flip = " + enableSpinFlip);
		System.out.println("Extra = " + enableExtra);
		System.out.println("Directly fail = " + directlyFail);
		System.out.println("Search finished = " + searchFinished);
		System.out.println("Single step search = " + singleStepSearch);
		System.out.println("Single solution search = " + singleSolutionSearch);
		System.out.println();
	}

	/******************** Private Member Functions ********************/

}

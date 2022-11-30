/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		statement += " ";
		statement = statement.toUpperCase();
		String response = "";

		System.out.println(statement);

		if (statement.length()<2) {
			response="Please say something, silence is rude.";
		}

		else if (statement.indexOf("NO ") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("MOTHER ") >= 0
				|| statement.indexOf("FATHER ") >= 0
				|| statement.indexOf("SISTER ") >= 0
				|| statement.indexOf("BROTHER ") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("CAT ") >= 0){ //Takes users input and sees if it contains phrase "cat" then responds if true
			response = "Tell me more about your cat/cat's";
		} else if (statement.indexOf("DOG ") >= 0) {//Takes users input and sees if it contains phrase "dog" then responds if true
			response = "Tell me more about your dog/dog's";
		} else if (statement.indexOf("HI ") >= 0){ //Takes users input and sees if it contains phrase "hi" and responds if true
			response = "Didn't we greet already";
		}
		  else if (statement.contains ("MR. SMITH ")){
			  response = "he sounds like a good teacher.";
		}
		else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4){
			response = "What did you say?";
		}
		else if (whichResponse == 5){
			response = "Cool!";
		}

		return response;
	}
}

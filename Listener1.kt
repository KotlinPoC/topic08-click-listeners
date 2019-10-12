// 1 setting OnClickListener(s) dynamically
// xml
/*
<Button
    android:id="@+id/button1"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    />
*/

// code, often in onCreate()

// NOTENOTENOTE 
// code not converted, I have to check kotlin framework
// also look into the extensions that get rid of findViewById()
// https://kotlinlang.org/docs/tutorials/android-plugin.html
{

	// get a handle on the button object
	val bt: Button =  findViewById(R.id.button) as Button
	// set the text on the button object
	bt.text  = "Press Me"

	// separate declaration of new OnClickListener
	// bt.setOnClickListener(usingContext);
	bt.setOnClickListener(object:View.OnClickListener {
  		  override fun onClick(v: View?) {
        // react to event goes here
    }
})
}
// code  interface as a type not used see other
private OnClickListener usingContext = 	new OnClickListener() {
	public void onClick(View v) {
		// react to event code goes here
	}
}; // usingContext()

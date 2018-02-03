<LinearLayout
        android:orientation="vertical"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="45dp">
        <CheckBox android:id="@+id/check_expresso"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Expresso"
            android:onClick="onCheckboxClicked"/>
        <CheckBox android:id="@+id/check_africano"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Africano"
            android:onClick="onCheckboxClicked"/>
    </LinearLayout>

    /**
     * check if the user has selected the kahawa type
     */
    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.check_expresso:
                if (checked) {
                    String kahawa_type = "Expresso";
                }
                break;
            case R.id.check_africano:
                if (checked) {
                    String kahawa_type = "Africano";
                }
                break;
            // TODO: Veggie sandwich
        }
    }

   

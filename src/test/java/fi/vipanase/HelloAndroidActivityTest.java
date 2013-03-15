/**
 * File: HelloAndroidActivityTest.java
 * Created: 3/15/13
 * Author: Viacheslav Panasenko
 */
package fi.vipanase;

import android.widget.Button;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * HelloAndroidActivityTest
 * Class description
 */
@RunWith(RobolectricTestRunner.class)
public class HelloAndroidActivityTest {

    private HelloAndroidActivity mActivity;
    private Button mHelloBtn;

    @Before
    public void setUp() throws Exception {
        mActivity = new HelloAndroidActivity();
        mActivity.onCreate(null);
        mHelloBtn = (Button) mActivity.findViewById(R.id.btn_hello);
    }

    @Test
    public void shouldHaveHelloButton() throws Exception {
        assertThat((String) mHelloBtn.getText().toString(), equalTo("Hello hello-continuous-integration!"));
    }
}

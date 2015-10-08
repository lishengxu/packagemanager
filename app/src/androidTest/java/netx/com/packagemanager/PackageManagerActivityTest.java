package netx.com.packagemanager;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

/**
 * Created by lsx on 15-10-8.
 */
public class PackageManagerActivityTest
        extends ActivityInstrumentationTestCase2<PackageManagerActivity> {

    private static final String TAG = PackageManagerActivityTest.class.getSimpleName();

    private Instrumentation mInstrument;
    private PackageManagerActivity mActivity;
    private TextView mHello;

    public PackageManagerActivityTest() {
        super(PackageManagerActivity.class);

    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mInstrument = getInstrumentation();
        mActivity = getActivity();
        mHello = (TextView) mActivity.findViewById(R.id.packagemanager_hello);
    }

    public void testHello() {
        assertEquals(mHello.getText().toString(), "Hello world!");
    }

    public void testPackageListNum() {
        assertEquals(100, mActivity.getApplicationList().size());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}

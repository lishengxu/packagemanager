package netx.com.packagemanager;

import android.app.Instrumentation;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
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
        assertEquals(111, mActivity.getAllPackageInfo().size());
    }

    public void testPackageListInfo() {
        assertEquals(111, mActivity.getAllApplicationInfo().size());
        boolean hasMM = false;
        for (int i = 0; i != mActivity.getAllApplicationInfo().size(); ++i) {
            if ("com.tencent.mm".equals(mActivity.getAllApplicationInfo().get(i).getPackageName())) {
                hasMM = true;
            }
            Log.e("test", "packagename:" + mActivity.getAllApplicationInfo().get(i).getPackageName());
            if ("com.sina.weibo".equals(mActivity.getAllApplicationInfo().get(i).getPackageName())) {
                assertEquals("微博", mActivity.getAllApplicationInfo().get(i).getPackageLabel());
            } else if ("com.tencent.mm".equals(mActivity.getAllApplicationInfo().get(i).getPackageName())) {
                assertEquals("微信", mActivity.getAllApplicationInfo().get(i).getPackageLabel());
            }
        }
        assertTrue(hasMM);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}

package netx.com.packagemanager;

/**
 * Created by lsx on 15-10-9.
 */
public class PackageBean {

    private String mPackageName;
    private String mPackageLabel;

    public PackageBean(String packageName, String packageLabel) {
        mPackageName = packageName;
        mPackageLabel = packageLabel;
    }

    public String getPackageName() {
        return mPackageName;
    }

    public String getPackageLabel() {
        return mPackageLabel;
    }
}

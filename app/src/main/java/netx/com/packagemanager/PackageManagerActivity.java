package netx.com.packagemanager;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class PackageManagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_package_manager);
    }

    public List<PackageInfo> getAllPackageInfo() {
        List<PackageInfo> packageinfos =
                getPackageManager().getInstalledPackages(0);
        return packageinfos;
    }

    public List<PackageBean> getAllApplicationInfo() {
        List<PackageBean> packagebeans = new ArrayList<>();
        for (PackageInfo info : getAllPackageInfo()) {
            packagebeans.add(new PackageBean(info.packageName,
                    info.applicationInfo.loadLabel(getPackageManager()).toString()));
        }
        return packagebeans;
    }
}

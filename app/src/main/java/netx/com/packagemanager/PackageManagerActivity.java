package netx.com.packagemanager;

import android.content.pm.ApplicationInfo;
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

    public List<ApplicationInfo> getApplicationList() {
        List<ApplicationInfo> list = new ArrayList<ApplicationInfo>(100);
        for (int i = 0; i != 100; ++i) {
            list.add(new ApplicationInfo());
        }
        return list;
    }
}

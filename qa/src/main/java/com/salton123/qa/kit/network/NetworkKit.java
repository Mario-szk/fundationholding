package com.salton123.qa.kit.network;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.salton123.qa.QualityAssistant;
import com.salton123.qa.constant.BundleKey;
import com.salton123.qa.constant.FragmentIndex;
import com.salton123.qa.kit.Category;
import com.salton123.qa.kit.IKit;
import com.salton123.qa.kit.SimpleKitViewItem;
import com.salton123.qa.ui.UniversalActivity;
import com.zhenai.qa.R;

/**
 * @desc: 网络监测kit
 */
public class NetworkKit implements IKit {

    @Override
    public int getCategory() {
        return Category.PERFORMANCE;
    }

    @Override
    public View displayItem() {
        return new SimpleKitViewItem(QualityAssistant.application) {

            @Override
            public int getName() {
                return R.string.dk_kit_network_monitor;
            }

            @Override
            public int getIcon() {
                return R.drawable.dk_net_monitor;
            }

            @Override
            public void onClick(Context context) {
                Intent intent = new Intent(context, UniversalActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra(BundleKey.FRAGMENT_INDEX, FragmentIndex.FRAGMENT_NETWORK_MONITOR);
                context.startActivity(intent);
            }
        };
    }

    @Override
    public void onAppInit(Context context) {

    }
}

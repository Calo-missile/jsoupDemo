package com.hsc.jsoupdemo;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

/**
 * Created by 15827 on 2017/8/2.
 */

public class JianShuAdapter extends BaseQuickAdapter<JianshuBeans,BaseViewHolder> {
    
    private Context mContext;

    public JianShuAdapter(Context context) {
        super(R.layout.item_home);
        this.mContext = context;
    }
    
    @Override
    protected void convert(BaseViewHolder helper, JianshuBeans beans) {
        helper.setText(R.id.tv_author,beans.getAuthorName())
                .setText(R.id.tv_time,beans.getTime())
                .setText(R.id.tv_title,beans.getTitle())
                .setText(R.id.tv_content,beans.getContent())
                .setText(R.id.tv_collectTag,beans.getCollectionTag())
                .setText(R.id.tv_read,beans.getReadNum())
                .setText(R.id.tv_talk,beans.getTalkNum())
                .setText(R.id.tv_like,beans.getLikeNum())
                .addOnClickListener(R.id.iv_primary)
                .addOnClickListener(R.id.iv_avatar)
                .addOnClickListener(R.id.tv_author)
                .addOnClickListener(R.id.tv_collectTag)
                .addOnClickListener(R.id.tv_content)
                .addOnClickListener(R.id.tv_title);
        Glide.with(mContext).load(beans.getAvatarImg()).crossFade().into((ImageView) helper.getView(R.id.iv_avatar));
        Glide.with(mContext).load(beans.getPrimaryImg()).crossFade().into((ImageView) helper.getView(R.id.iv_primary));        
    }
}

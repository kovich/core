package com.oreo.coresample.presenter;

import com.android.core.model.annotation.Implement;


/**
 * @author: oreo
 * @date: 2016-08-01 15:13
 *  @GitHub: https://github.com/oreo
 *
 */
@Implement(DataPresenter.class)
public interface DataContract {

    void getPackageList(int page,int tag);

}
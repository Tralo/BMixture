package com.study.bmixture.base.view;


/**
 * View 基类
 */
public interface BaseView {

    /**
     * 显示错误信息
     * @param error
     */
    void showErrorMsg(String error);

    /**
     * 报错
     */
    void showError();

    /**
     * 显示进度条
     */
    void showLoading();



}

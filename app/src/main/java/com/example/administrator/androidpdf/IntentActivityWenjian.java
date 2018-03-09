package com.example.administrator.androidpdf;

import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.lidong.pdf.PDFView;
import com.lidong.pdf.listener.OnDrawListener;
import com.lidong.pdf.listener.OnLoadCompleteListener;
import com.lidong.pdf.listener.OnPageChangeListener;


public class IntentActivityWenjian extends AppCompatActivity implements OnPageChangeListener
        , OnLoadCompleteListener, OnDrawListener {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_wenjian_activity);
        pdfView = (PDFView) findViewById(R.id.pdfView);
        displayFromFile1("http://file.chmsp.com.cn/colligate/file/00100000224821.pdf", "00100000224821.pdf");
//        displayFromFile1("https://pic.bincrea.com/bc_bg_6D40C91A170D41C182511ABBB8A634A4.pdf","bc_bg_6D40C91A170D41C182511ABBB8A634A4.pdf") ;
    }

    /**
     * 获取打开网络的pdf文件
     *
     * @param fileUrl
     * @param fileName
     */
    private void displayFromFile1(String fileUrl, String fileName) {
        pdfView.fileFromLocalStorage(this, this, this, fileUrl, fileName);   //设置pdf文件地址
    }

    /**
     * 翻页回调
     *
     * @param page
     * @param pageCount
     */
    @Override
    public void onPageChanged(int page, int pageCount) {
        Toast.makeText(IntentActivityWenjian.this, "" + page, Toast.LENGTH_SHORT).show();
    }

    /**
     * 加载完成回调
     *
     * @param nbPages 总共的页数
     */
    @Override
    public void loadComplete(int nbPages) {
        Toast.makeText(IntentActivityWenjian.this, "加载完成" + nbPages, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLayerDrawn(Canvas canvas, float pageWidth, float pageHeight, int displayedPage) {
        // Toast.makeText( MainActivity.this ,  "pageWidth= " + pageWidth + "
        // pageHeight= " + pageHeight + " displayedPage="  + displayedPage , Toast.LENGTH_SHORT).show();
    }
}


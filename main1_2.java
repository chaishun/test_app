package com.example.admin.testapp_52;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter ap;
    ListView li;
    AutoCompleteTextView   lr;
    Button got,zh,shsy,xk;
    String[] fr;
    String[] school;
    String[] dz1;
    String[] names;
    String texts="清华大学";
    int id=1;
    List<String[]> p=new  ArrayList<String[]>();
    public List<String[]> getD() {
        Resources r=getResources();
        p.add(r.getStringArray(R.array.清华大学));
        p.add(r.getStringArray(R.array.北京大学));
        p.add(r.getStringArray(R.array.浙江大学));
        p.add(r.getStringArray(R.array.上海交通大学));
        p.add(r.getStringArray(R.array.复旦大学));
        p.add(r.getStringArray(R.array.中国科学技术大学));
        p.add(r.getStringArray(R.array.南京大学));
        p.add(r.getStringArray(R.array.华中科技大学));
        p.add(r.getStringArray(R.array.中山大学));
        p.add(r.getStringArray(R.array.哈尔滨工业大学));
        p.add(r.getStringArray(R.array.同济大学));
        p.add(r.getStringArray(R.array.武汉大学));
        p.add(r.getStringArray(R.array.东南大学));
        p.add(r.getStringArray(R.array.西安交通大学));
        p.add(r.getStringArray(R.array.北京航空航天大学));
        p.add(r.getStringArray(R.array.南开大学));
        p.add(r.getStringArray(R.array.四川大学));
        p.add(r.getStringArray(R.array.天津大学));
        p.add(r.getStringArray(R.array.华南理工大学));
        p.add(r.getStringArray(R.array.北京师范大学));
        p.add(r.getStringArray(R.array.北京理工大学));
        p.add(r.getStringArray(R.array.厦门大学));
        p.add(r.getStringArray(R.array.吉林大学));
        p.add(r.getStringArray(R.array.山东大学));
        p.add(r.getStringArray(R.array.大连理工大学));
        p.add(r.getStringArray(R.array.中南大学));
        p.add(r.getStringArray(R.array.苏州大学));
        p.add(r.getStringArray(R.array.对外经济贸易大学));
        p.add(r.getStringArray(R.array.西北工业大学));
        p.add(r.getStringArray(R.array.中国人民大学));
        p.add(r.getStringArray(R.array.湖南大学));
        p.add(r.getStringArray(R.array.华东师范大学));
        p.add(r.getStringArray(R.array.电子科技大学));
        p.add(r.getStringArray(R.array.华东理工大学));
        p.add(r.getStringArray(R.array.重庆大学));
        p.add(r.getStringArray(R.array.南京航空航天大学));
        p.add(r.getStringArray(R.array.北京科技大学));
        p.add(r.getStringArray(R.array.南京理工大学));
        p.add(r.getStringArray(R.array.上海财经大学));
        p.add(r.getStringArray(R.array.中国农业大学));
        p.add(r.getStringArray(R.array.上海大学));
        p.add(r.getStringArray(R.array.东北大学));
        p.add(r.getStringArray(R.array.华中师范大学));
        p.add(r.getStringArray(R.array.南方科技大学));
        p.add(r.getStringArray(R.array.北京交通大学));
        p.add(r.getStringArray(R.array.首都医科大学));
        p.add(r.getStringArray(R.array.武汉理工大学));
        p.add(r.getStringArray(R.array.北京化工大学));
        p.add(r.getStringArray(R.array.北京邮电大学));
        p.add(r.getStringArray(R.array.东华大学));
        p.add(r.getStringArray(R.array.北京外国语大学));
        p.add(r.getStringArray(R.array.天津医科大学));
        p.add(r.getStringArray(R.array.中央财经大学));
        p.add(r.getStringArray(R.array.西安电子科技大学));
        p.add(r.getStringArray(R.array.南京医科大学));
        p.add(r.getStringArray(R.array.暨南大学));
        p.add(r.getStringArray(R.array.兰州大学));
        p.add(r.getStringArray(R.array.江南大学));
        p.add(r.getStringArray(R.array.华北电力大学));
        p.add(r.getStringArray(R.array.中国海洋大学));
        p.add(r.getStringArray(R.array.哈尔滨工程大学));
        p.add(r.getStringArray(R.array.中国地质大学武汉));
        p.add(r.getStringArray(R.array.华中农业大学));
        p.add(r.getStringArray(R.array.南京师范大学));
        p.add(r.getStringArray(R.array.东北师范大学));
        p.add(r.getStringArray(R.array.西南财经大学));
        p.add(r.getStringArray(R.array.福州大学));
        p.add(r.getStringArray(R.array.中国药科大学));
        p.add(r.getStringArray(R.array.中国地质大学));
        p.add(r.getStringArray(R.array.上海外国语大学));
        p.add(r.getStringArray(R.array.南京农业大学));
        p.add(r.getStringArray(R.array.北京工业大学));
        p.add(r.getStringArray(R.array.河海大学));
        p.add(r.getStringArray(R.array.西南交通大学));
        p.add(r.getStringArray(R.array.中国医科大学));
        p.add(r.getStringArray(R.array.西南大学));
        p.add(r.getStringArray(R.array.南方医科大学));
        p.add(r.getStringArray(R.array.中南财经政法大学));
        p.add(r.getStringArray(R.array.南京信息工程大学));
        p.add(r.getStringArray(R.array.江苏大学));
        p.add(r.getStringArray(R.array.中国石油大学华东));
        p.add(r.getStringArray(R.array.合肥工业大学));
        p.add(r.getStringArray(R.array.上海中医药大学));
        p.add(r.getStringArray(R.array.中国矿业大学));
        p.add(r.getStringArray(R.array.浙江工业大学));
        p.add(r.getStringArray(R.array.北京中医药大学));
        p.add(r.getStringArray(R.array.华侨大学));
        p.add(r.getStringArray(R.array.西北农林科技大学));
        p.add(r.getStringArray(R.array.北京林业大学));
        p.add(r.getStringArray(R.array.东北财经大学));
        p.add(r.getStringArray(R.array.南京邮电大学));
        p.add(r.getStringArray(R.array.深圳大学));
        p.add(r.getStringArray(R.array.中央民族大学));
        p.add(r.getStringArray(R.array.南京工业大学));
        p.add(r.getStringArray(R.array.中国政法大学));
        p.add(r.getStringArray(R.array.大连医科大学));
        p.add(r.getStringArray(R.array.中国石油大学));
        p.add(r.getStringArray(R.array.西北大学));
        p.add(r.getStringArray(R.array.中国传媒大学));
        p.add(r.getStringArray(R.array.宁波大学));
        p.add(r.getStringArray(R.array.扬州大学));
        p.add(r.getStringArray(R.array.华南师范大学));
        p.add(r.getStringArray(R.array.陕西师范大学));
        p.add(r.getStringArray(R.array.浙江师范大学));
        p.add(r.getStringArray(R.array.首都经济贸易大学));
        p.add(r.getStringArray(R.array.西交利物浦大学));
        p.add(r.getStringArray(R.array.首都师范大学));
        p.add(r.getStringArray(R.array.浙江理工大学));
        p.add(r.getStringArray(R.array.广东外语外贸大学));
        p.add(r.getStringArray(R.array.湖南师范大学));
        p.add(r.getStringArray(R.array.汕头大学));
        p.add(r.getStringArray(R.array.燕山大学));
        p.add(r.getStringArray(R.array.杭州电子科技大学));
        p.add(r.getStringArray(R.array.广西医科大学));
        p.add(r.getStringArray(R.array.南京财经大学));
        p.add(r.getStringArray(R.array.中国矿业大学));
        p.add(r.getStringArray(R.array.哈尔滨医科大学));
        p.add(r.getStringArray(R.array.安徽大学));
        p.add(r.getStringArray(R.array.河北医科大学));
        p.add(r.getStringArray(R.array.湖北大学));
        p.add(r.getStringArray(R.array.河北工业大学));
        p.add(r.getStringArray(R.array.云南大学));
        p.add(r.getStringArray(R.array.大连海事大学));
        p.add(r.getStringArray(R.array.上海理工大学));
        p.add(r.getStringArray(R.array.湘潭大学));
        p.add(r.getStringArray(R.array.长安大学));
        p.add(r.getStringArray(R.array.杭州师范大学));
        p.add(r.getStringArray(R.array.太原理工大学));
        p.add(r.getStringArray(R.array.重庆医科大学));
        p.add(r.getStringArray(R.array.浙江工商大学));
        p.add(r.getStringArray(R.array.沈阳药科大学));
        p.add(r.getStringArray(R.array.上海对外经贸大学));
        p.add(r.getStringArray(R.array.温州医科大学));
        p.add(r.getStringArray(R.array.上海师范大学));
        p.add(r.getStringArray(R.array.南昌大学));
        p.add(r.getStringArray(R.array.浙江财经大学));
        p.add(r.getStringArray(R.array.广西大学));
        p.add(r.getStringArray(R.array.江西财经大学));
        p.add(r.getStringArray(R.array.辽宁大学));
        p.add(r.getStringArray(R.array.青岛大学));
        p.add(r.getStringArray(R.array.武汉科技大学));
        p.add(r.getStringArray(R.array.东北农业大学));
        p.add(r.getStringArray(R.array.华南农业大学));
        p.add(r.getStringArray(R.array.广东工业大学));
        p.add(r.getStringArray(R.array.山西大学));
        p.add(r.getStringArray(R.array.安徽医科大学));
        p.add(r.getStringArray(R.array.东北林业大学));
        p.add(r.getStringArray(R.array.徐州医科大学));
        p.add(r.getStringArray(R.array.郑州大学));
        p.add(r.getStringArray(R.array.广州医科大学));
        p.add(r.getStringArray(R.array.三峡大学));
        p.add(r.getStringArray(R.array.黑龙江大学));
        p.add(r.getStringArray(R.array.上海海事大学));
        p.add(r.getStringArray(R.array.福建医科大学));
        p.add(r.getStringArray(R.array.河北大学));
        p.add(r.getStringArray(R.array.江苏师范大学));
        p.add(r.getStringArray(R.array.广西师范大学));
        p.add(r.getStringArray(R.array.济南大学));
        p.add(r.getStringArray(R.array.石家庄铁道大学));
        p.add(r.getStringArray(R.array.天津师范大学));
        p.add(r.getStringArray(R.array.北京体育大学));
        p.add(r.getStringArray(R.array.武汉工程大学));
        p.add(r.getStringArray(R.array.北京工商大学));
        p.add(r.getStringArray(R.array.天津财经大学));
        p.add(r.getStringArray(R.array.北京物资学院));
        p.add(r.getStringArray(R.array.天津工业大学));
        p.add(r.getStringArray(R.array.长沙理工大学));
        p.add(r.getStringArray(R.array.中南民族大学));
        p.add(r.getStringArray(R.array.渤海大学));
        p.add(r.getStringArray(R.array.湖北工业大学));
        p.add(r.getStringArray(R.array.南京审计大学));
        p.add(r.getStringArray(R.array.南京中医药大学));
        p.add(r.getStringArray(R.array.河北师范大学));
        p.add(r.getStringArray(R.array.河南大学));
        p.add(r.getStringArray(R.array.中国人民公安大学));
        p.add(r.getStringArray(R.array.广州大学));
        p.add(r.getStringArray(R.array.山东师范大学));
        p.add(r.getStringArray(R.array.四川农业大学));
        p.add(r.getStringArray(R.array.常州大学));
        p.add(r.getStringArray(R.array.南通大学));
        p.add(r.getStringArray(R.array.中国民航大学));
        p.add(r.getStringArray(R.array.广州中医药大学));
        p.add(r.getStringArray(R.array.北京建筑大学));
        p.add(r.getStringArray(R.array.安徽财经大学));
        p.add(r.getStringArray(R.array.天津中医药大学));
        p.add(r.getStringArray(R.array.武汉纺织大学));
        p.add(r.getStringArray(R.array.江苏科技大学));
        p.add(r.getStringArray(R.array.重庆工商大学));
        p.add(r.getStringArray(R.array.河北科技大学));
        p.add(r.getStringArray(R.array.温州大学));
        p.add(r.getStringArray(R.array.华北理工大学));
        p.add(r.getStringArray(R.array.辽宁工业大学));
        p.add(r.getStringArray(R.array.青岛科技大学));
        p.add(r.getStringArray(R.array.西安理工大学));
        p.add(r.getStringArray(R.array.北方工业大学));
        p.add(r.getStringArray(R.array.重庆邮电大学));
        p.add(r.getStringArray(R.array.昆明医科大学));
        p.add(r.getStringArray(R.array.云南师范大学));
        p.add(r.getStringArray(R.array.长春理工大学));
        p.add(r.getStringArray(R.array.福建师范大学));
        p.add(r.getStringArray(R.array.宁夏医科大学));
        p.add(r.getStringArray(R.array.浙江农林大学));
        p.add(r.getStringArray(R.array.中国计量大学));
        p.add(r.getStringArray(R.array.湖北中医药大学));
        p.add(r.getStringArray(R.array.内蒙古大学));
        p.add(r.getStringArray(R.array.沈阳航空航天大学));
        p.add(r.getStringArray(R.array.河南师范大学));
        p.add(r.getStringArray(R.array.上海海洋大学));
        p.add(r.getStringArray(R.array.苏州科技大学));
        p.add(r.getStringArray(R.array.天津理工大学));
        p.add(r.getStringArray(R.array.山东财经大学));
        p.add(r.getStringArray(R.array.安徽工业大学));
        p.add(r.getStringArray(R.array.湖北第二师范学院));
        p.add(r.getStringArray(R.array.沈阳医学院));
        p.add(r.getStringArray(R.array.安徽师范大学));
        p.add(r.getStringArray(R.array.海南大学));
        p.add(r.getStringArray(R.array.黑龙江中医药大学));
        p.add(r.getStringArray(R.array.湖南农业大学));
        p.add(r.getStringArray(R.array.新乡医学院));
        p.add(r.getStringArray(R.array.长江大学));
        p.add(r.getStringArray(R.array.福建农林大学));
        p.add(r.getStringArray(R.array.西安建筑科技大学));
        p.add(r.getStringArray(R.array.江西师范大学));
        p.add(r.getStringArray(R.array.山东科技大学));
        p.add(r.getStringArray(R.array.贵州大学));
        p.add(r.getStringArray(R.array.辽宁师范大学));
        p.add(r.getStringArray(R.array.上海电力学院));
        p.add(r.getStringArray(R.array.湖南中医药大学));
        p.add(r.getStringArray(R.array.上海立信会计金融学院));
        p.add(r.getStringArray(R.array.天津科技大学));
        p.add(r.getStringArray(R.array.武汉轻工大学));
        p.add(r.getStringArray(R.array.延边大学));
        p.add(r.getStringArray(R.array.集美大学));
        p.add(r.getStringArray(R.array.闽南师范大学));
        p.add(r.getStringArray(R.array.北京信息科技大学));
        p.add(r.getStringArray(R.array.河北农业大学));
        p.add(r.getStringArray(R.array.湖北经济学院));
        p.add(r.getStringArray(R.array.湖南工业大学));
        p.add(r.getStringArray(R.array.南京工程学院));
        p.add(r.getStringArray(R.array.西南民族大学));
        p.add(r.getStringArray(R.array.山西财经大学));
        p.add(r.getStringArray(R.array.西华师范大学));
        p.add(r.getStringArray(R.array.广西民族大学));
        p.add(r.getStringArray(R.array.桂林医学院));
        p.add(r.getStringArray(R.array.江汉大学));
        p.add(r.getStringArray(R.array.四川师范大学));
        p.add(r.getStringArray(R.array.成都理工大学));
        p.add(r.getStringArray(R.array.重庆交通大学));
        p.add(r.getStringArray(R.array.山西师范大学));
        p.add(r.getStringArray(R.array.锦州医科大学));
        p.add(r.getStringArray(R.array.南华大学));
        p.add(r.getStringArray(R.array.西南石油大学));
        p.add(r.getStringArray(R.array.浙江中医药大学));
        p.add(r.getStringArray(R.array.河南理工大学));
        p.add(r.getStringArray(R.array.湖南科技大学));
        p.add(r.getStringArray(R.array.桂林电子科技大学));
        p.add(r.getStringArray(R.array.信阳师范学院));
        p.add(r.getStringArray(R.array.福建中医药大学));
        p.add(r.getStringArray(R.array.广西中医药大学));
        p.add(r.getStringArray(R.array.湖北师范大学));
        p.add(r.getStringArray(R.array.吉林师范大学));
        p.add(r.getStringArray(R.array.昆明理工大学));
        p.add(r.getStringArray(R.array.新疆医科大学));
        p.add(r.getStringArray(R.array.中北大学));
        p.add(r.getStringArray(R.array.长春中医药大学));
        p.add(r.getStringArray(R.array.西南医科大学));
        p.add(r.getStringArray(R.array.浙江传媒学院));
        p.add(r.getStringArray(R.array.曲阜师范大学));
        p.add(r.getStringArray(R.array.陕西科技大学));
        p.add(r.getStringArray(R.array.重庆师范大学));
        p.add(r.getStringArray(R.array.东北电力大学));
        p.add(r.getStringArray(R.array.中南林业科技大学));
        p.add(r.getStringArray(R.array.哈尔滨师范大学));
        p.add(r.getStringArray(R.array.湖州师范学院));
        p.add(r.getStringArray(R.array.吉林财经大学));
        p.add(r.getStringArray(R.array.辽宁中医药大学));
        p.add(r.getStringArray(R.array.南京林业大学));
        p.add(r.getStringArray(R.array.云南财经大学));
        p.add(r.getStringArray(R.array.常熟理工学院));
        p.add(r.getStringArray(R.array.重庆理工大学));
        p.add(r.getStringArray(R.array.广东医科大学));
        p.add(r.getStringArray(R.array.哈尔滨理工大学));
        p.add(r.getStringArray(R.array.河南财经政法大学));
        p.add(r.getStringArray(R.array.西安邮电大学));
        p.add(r.getStringArray(R.array.广东财经大学));
        p.add(r.getStringArray(R.array.青岛理工大学));
        p.add(r.getStringArray(R.array.湖北医药学院));
        p.add(r.getStringArray(R.array.山西医科大学));
        p.add(r.getStringArray(R.array.东北石油大学));
        p.add(r.getStringArray(R.array.兰州交通大学));
        p.add(r.getStringArray(R.array.山东农业大学));
        p.add(r.getStringArray(R.array.西北师范大学));
        p.add(r.getStringArray(R.array.右江民族医学院));
        p.add(r.getStringArray(R.array.河南工业大学));
        p.add(r.getStringArray(R.array.上海体育学院));
        p.add(r.getStringArray(R.array.黄冈师范学院));
        p.add(r.getStringArray(R.array.宁夏大学));
        p.add(r.getStringArray(R.array.绍兴文理学院));
        p.add(r.getStringArray(R.array.沈阳建筑大学));
        p.add(r.getStringArray(R.array.浙江科技学院));
        p.add(r.getStringArray(R.array.大连交通大学));
        p.add(r.getStringArray(R.array.安徽农业大学));
        p.add(r.getStringArray(R.array.成都中医药大学));
        p.add(r.getStringArray(R.array.广西师范学院));
        p.add(r.getStringArray(R.array.河北经贸大学));
        p.add(r.getStringArray(R.array.河南农业大学));
        p.add(r.getStringArray(R.array.浙江海洋大学));
        p.add(r.getStringArray(R.array.桂林理工大学));
        p.add(r.getStringArray(R.array.上海工程技术大学));
        p.add(r.getStringArray(R.array.新疆大学));
        p.add(r.getStringArray(R.array.烟台大学));
        p.add(r.getStringArray(R.array.上海应用技术大学));
        p.add(r.getStringArray(R.array.长春工业大学));
        p.add(r.getStringArray(R.array.大连民族大学));
        p.add(r.getStringArray(R.array.河北工程大学));
        p.add(r.getStringArray(R.array.河南科技大学));
        p.add(r.getStringArray(R.array.兰州理工大学));
        p.add(r.getStringArray(R.array.上海第二工业大学));
        p.add(r.getStringArray(R.array.大理大学));
        p.add(r.getStringArray(R.array.重庆文理学院));
        p.add(r.getStringArray(R.array.河北北方学院));
        p.add(r.getStringArray(R.array.盐城工学院));
        p.add(r.getStringArray(R.array.大连大学));
        p.add(r.getStringArray(R.array.广东药科大学));
        p.add(r.getStringArray(R.array.华东交通大学));
        p.add(r.getStringArray(R.array.江苏理工学院));
        p.add(r.getStringArray(R.array.沈阳师范大学));
        p.add(r.getStringArray(R.array.西安工业大学));
        p.add(r.getStringArray(R.array.北京印刷学院));
        p.add(r.getStringArray(R.array.淮阴师范学院));
        p.add(r.getStringArray(R.array.内蒙古医科大学));
        p.add(r.getStringArray(R.array.玉林师范学院));
        p.add(r.getStringArray(R.array.大连工业大学));
        p.add(r.getStringArray(R.array.河北地质大学));
        p.add(r.getStringArray(R.array.湖北工程学院));
        p.add(r.getStringArray(R.array.沈阳工业大学));
        p.add(r.getStringArray(R.array.贵州医科大学));
        p.add(r.getStringArray(R.array.厦门理工学院));
        p.add(r.getStringArray(R.array.云南中医学院));
        p.add(r.getStringArray(R.array.承德医学院));
        p.add(r.getStringArray(R.array.广东海洋大学));
        p.add(r.getStringArray(R.array.太原科技大学));
        p.add(r.getStringArray(R.array.天津商业大学));
        p.add(r.getStringArray(R.array.徐州工程学院));
        p.add(r.getStringArray(R.array.盐城师范学院));
        p.add(r.getStringArray(R.array.长春大学));
        p.add(r.getStringArray(R.array.金陵科技学院));
        p.add(r.getStringArray(R.array.湖北汽车工业学院));
        p.add(r.getStringArray(R.array.南京晓庄学院));
        p.add(r.getStringArray(R.array.西安科技大学));
        p.add(r.getStringArray(R.array.郑州师范学院));
        p.add(r.getStringArray(R.array.广东技术师范学院));
        p.add(r.getStringArray(R.array.哈尔滨商业大学));
        p.add(r.getStringArray(R.array.海南师范大学));
        p.add(r.getStringArray(R.array.湖南商学院));
        p.add(r.getStringArray(R.array.山西大同大学));
        p.add(r.getStringArray(R.array.沈阳农业大学));
        p.add(r.getStringArray(R.array.安阳师范学院));
        p.add(r.getStringArray(R.array.嘉兴学院));
        p.add(r.getStringArray(R.array.齐齐哈尔医学院));
        p.add(r.getStringArray(R.array.山东中医药大学));
        p.add(r.getStringArray(R.array.太原师范学院));
        p.add(r.getStringArray(R.array.潍坊医学院));
        p.add(r.getStringArray(R.array.安徽建筑大学));
        p.add(r.getStringArray(R.array.滨州医学院));
        p.add(r.getStringArray(R.array.川北医学院));
        p.add(r.getStringArray(R.array.广东金融学院));
        p.add(r.getStringArray(R.array.淮北师范大学));
        p.add(r.getStringArray(R.array.吉首大学));
        p.add(r.getStringArray(R.array.南昌航空大学));
        p.add(r.getStringArray(R.array.西安医学院));
        p.add(r.getStringArray(R.array.郑州轻工业学院));
        p.add(r.getStringArray(R.array.长沙学院));
        p.add(r.getStringArray(R.array.大连海洋大学));
        p.add(r.getStringArray(R.array.辽宁工程技术大学));
        p.add(r.getStringArray(R.array.山西农业大学));
        p.add(r.getStringArray(R.array.湖南第一师范学院));
        p.add(r.getStringArray(R.array.吉林农业大学));
        p.add(r.getStringArray(R.array.济宁医学院));
        p.add(r.getStringArray(R.array.西华大学));
        p.add(r.getStringArray(R.array.北京农学院));
        p.add(r.getStringArray(R.array.佛山科学技术学院));
        p.add(r.getStringArray(R.array.淮海工学院));
        p.add(r.getStringArray(R.array.江苏第二师范学院));
        p.add(r.getStringArray(R.array.西安石油大学));
        p.add(r.getStringArray(R.array.海南医学院));
        p.add(r.getStringArray(R.array.河北科技师范学院));
        p.add(r.getStringArray(R.array.湖北民族学院));
        p.add(r.getStringArray(R.array.陕西中医药大学));
        p.add(r.getStringArray(R.array.石河子大学));
        p.add(r.getStringArray(R.array.北华大学));
        p.add(r.getStringArray(R.array.长治医学院));
        p.add(r.getStringArray(R.array.牡丹江医学院));
        p.add(r.getStringArray(R.array.浙江外国语学院));
        p.add(r.getStringArray(R.array.安徽工程大学));
        p.add(r.getStringArray(R.array.湖南理工学院));
        p.add(r.getStringArray(R.array.西安工程大学));
        p.add(r.getStringArray(R.array.北京石油化工学院));
        p.add(r.getStringArray(R.array.河南中医药大学));
        p.add(r.getStringArray(R.array.江西理工大学));
        p.add(r.getStringArray(R.array.长春师范大学));
        p.add(r.getStringArray(R.array.湖北科技学院));
        p.add(r.getStringArray(R.array.福建工程学院));
        p.add(r.getStringArray(R.array.贵州师范学院));
        p.add(r.getStringArray(R.array.吉林医药学院));
        p.add(r.getStringArray(R.array.泰山医学院));
        p.add(r.getStringArray(R.array.云南民族大学));
        p.add(r.getStringArray(R.array.湖北理工学院));
        p.add(r.getStringArray(R.array.江西科技师范大学));
        p.add(r.getStringArray(R.array.青海大学));
        p.add(r.getStringArray(R.array.山东建筑大学));
        p.add(r.getStringArray(R.array.西安财经学院));
        p.add(r.getStringArray(R.array.忻州师范学院));
        p.add(r.getStringArray(R.array.云南农业大学));
        p.add(r.getStringArray(R.array.安徽理工大学));
        p.add(r.getStringArray(R.array.广东第二师范学院));
        p.add(r.getStringArray(R.array.宁波工程学院));
        p.add(r.getStringArray(R.array.沈阳大学));
        p.add(r.getStringArray(R.array.沈阳化工大学));
        p.add(r.getStringArray(R.array.赣南医学院));
        p.add(r.getStringArray(R.array.沈阳理工大学));
        p.add(r.getStringArray(R.array.西南科技大学));
        p.add(r.getStringArray(R.array.延安大学));
        p.add(r.getStringArray(R.array.遵义医学院));
        p.add(r.getStringArray(R.array.鲁东大学));
        p.add(r.getStringArray(R.array.西安文理学院));
        p.add(r.getStringArray(R.array.东华理工大学));
        p.add(r.getStringArray(R.array.哈尔滨学院));
        p.add(r.getStringArray(R.array.江西农业大学));
        p.add(r.getStringArray(R.array.辽宁石油化工大学));
        p.add(r.getStringArray(R.array.闽江学院));
        p.add(r.getStringArray(R.array.曲靖师范学院));
        p.add(r.getStringArray(R.array.西南林业大学));
        p.add(r.getStringArray(R.array.常州工学院));
        p.add(r.getStringArray(R.array.东莞理工学院));
        p.add(r.getStringArray(R.array.石家庄学院));
        p.add(r.getStringArray(R.array.中原工学院));
        p.add(r.getStringArray(R.array.蚌埠医学院));
        p.add(r.getStringArray(R.array.湖南文理学院));
        p.add(r.getStringArray(R.array.辽宁科技大学));
        p.add(r.getStringArray(R.array.唐山学院));
        p.add(r.getStringArray(R.array.天津城建大学));
        p.add(r.getStringArray(R.array.北京服装学院));
        p.add(r.getStringArray(R.array.广东石油化工学院));
        p.add(r.getStringArray(R.array.江西中医药大学));
        p.add(r.getStringArray(R.array.齐齐哈尔大学));
        p.add(r.getStringArray(R.array.山东理工大学));
        p.add(r.getStringArray(R.array.陕西理工大学));
        p.add(r.getStringArray(R.array.通化师范学院));
        p.add(r.getStringArray(R.array.成都学院));
        p.add(r.getStringArray(R.array.廊坊师范学院));
        p.add(r.getStringArray(R.array.齐鲁工业大学));
        p.add(r.getStringArray(R.array.五邑大学));
        p.add(r.getStringArray(R.array.宝鸡文理学院));
        p.add(r.getStringArray(R.array.贵州财经大学));
        p.add(r.getStringArray(R.array.华北水利水电大学));
        p.add(r.getStringArray(R.array.吉林建筑大学));
        p.add(r.getStringArray(R.array.青岛农业大学));
        p.add(r.getStringArray(R.array.上海电机学院));
        p.add(r.getStringArray(R.array.佳木斯大学));
        p.add(r.getStringArray(R.array.沈阳工程学院));
        p.add(r.getStringArray(R.array.郑州航空工业管理学院));
        p.add(r.getStringArray(R.array.成都信息工程大学));
        p.add(r.getStringArray(R.array.河南工程学院));
        p.add(r.getStringArray(R.array.黑龙江科技大学));
        p.add(r.getStringArray(R.array.湖南财政经济学院));
        p.add(r.getStringArray(R.array.甘肃农业大学));
        p.add(r.getStringArray(R.array.贵州师范大学));
        p.add(r.getStringArray(R.array.临沂大学));
        p.add(r.getStringArray(R.array.四川理工学院));
        p.add(r.getStringArray(R.array.皖南医学院));
        p.add(r.getStringArray(R.array.岭南师范学院));
        p.add(r.getStringArray(R.array.运城学院));
        p.add(r.getStringArray(R.array.赣南师范大学));
        p.add(r.getStringArray(R.array.洛阳理工学院));
        p.add(r.getStringArray(R.array.太原工业学院));
        p.add(r.getStringArray(R.array.唐山师范学院));
        p.add(r.getStringArray(R.array.中国民用航空飞行学院));
        p.add(r.getStringArray(R.array.长江师范学院));
        p.add(r.getStringArray(R.array.湖北文理学院));
        p.add(r.getStringArray(R.array.昆明学院));
        p.add(r.getStringArray(R.array.内江师范学院));
        p.add(r.getStringArray(R.array.天津农学院));
        p.add(r.getStringArray(R.array.仲恺农业工程学院));
        p.add(r.getStringArray(R.array.贵州民族大学));
        p.add(r.getStringArray(R.array.黑龙江工程学院));
        p.add(r.getStringArray(R.array.景德镇陶瓷大学));
        p.add(r.getStringArray(R.array.许昌学院));
        p.add(r.getStringArray(R.array.重庆第二师范学院));
        p.add(r.getStringArray(R.array.内蒙古工业大学));
        p.add(r.getStringArray(R.array.钦州学院));
        p.add(r.getStringArray(R.array.泉州师范学院));
        p.add(r.getStringArray(R.array.北京联合大学));
        p.add(r.getStringArray(R.array.重庆科技学院));
        p.add(r.getStringArray(R.array.新疆师范大学));
        p.add(r.getStringArray(R.array.衡阳师范学院));
        p.add(r.getStringArray(R.array.荆楚理工学院));
        p.add(r.getStringArray(R.array.龙岩学院));
        p.add(r.getStringArray(R.array.山东工商学院));
        p.add(r.getStringArray(R.array.天津职业技术师范大学));
        p.add(r.getStringArray(R.array.邢台学院));
        p.add(r.getStringArray(R.array.肇庆学院));
        p.add(r.getStringArray(R.array.湖南工程学院));
        p.add(r.getStringArray(R.array.惠州学院));
        p.add(r.getStringArray(R.array.湘南学院));
        p.add(r.getStringArray(R.array.鞍山师范学院));
        p.add(r.getStringArray(R.array.淮阴工学院));
        p.add(r.getStringArray(R.array.洛阳师范学院));
        p.add(r.getStringArray(R.array.商丘师范学院));
        p.add(r.getStringArray(R.array.广西科技大学));
        p.add(r.getStringArray(R.array.安庆师范大学));
        p.add(r.getStringArray(R.array.北华航天工业学院));
        p.add(r.getStringArray(R.array.成都医学院));
        p.add(r.getStringArray(R.array.丽水学院));
        p.add(r.getStringArray(R.array.聊城大学));
        p.add(r.getStringArray(R.array.南阳师范学院));
        p.add(r.getStringArray(R.array.乐山师范学院));
        p.add(r.getStringArray(R.array.安徽中医药大学));
        p.add(r.getStringArray(R.array.井冈山大学));
        p.add(r.getStringArray(R.array.南昌工程学院));
        p.add(r.getStringArray(R.array.韩山师范学院));
        p.add(r.getStringArray(R.array.合肥学院));
        p.add(r.getStringArray(R.array.湖南城市学院));
        p.add(r.getStringArray(R.array.莆田学院));
        p.add(r.getStringArray(R.array.青海师范大学));
        p.add(r.getStringArray(R.array.合肥师范学院));
        p.add(r.getStringArray(R.array.吉林化工学院));
        p.add(r.getStringArray(R.array.兰州城市学院));
        p.add(r.getStringArray(R.array.绵阳师范学院));
        p.add(r.getStringArray(R.array.韶关学院));
        p.add(r.getStringArray(R.array.咸阳师范学院));
        p.add(r.getStringArray(R.array.河南科技学院));
        p.add(r.getStringArray(R.array.新乡学院));
        p.add(r.getStringArray(R.array.西北民族大学));
        p.add(r.getStringArray(R.array.黑龙江八一农垦大学));
        p.add(r.getStringArray(R.array.内蒙古民族大学));
        p.add(r.getStringArray(R.array.邯郸学院));
        p.add(r.getStringArray(R.array.宜宾学院));
        p.add(r.getStringArray(R.array.北方民族大学));
        p.add(r.getStringArray(R.array.贵阳中医学院));
        p.add(r.getStringArray(R.array.黄淮学院));
        p.add(r.getStringArray(R.array.贺州学院));
        p.add(r.getStringArray(R.array.红河学院));
        p.add(r.getStringArray(R.array.辽东学院));
        p.add(r.getStringArray(R.array.内蒙古农业大学));
        p.add(r.getStringArray(R.array.齐鲁师范学院));
        p.add(r.getStringArray(R.array.渭南师范学院));
        p.add(r.getStringArray(R.array.长春工程学院));
        p.add(r.getStringArray(R.array.内蒙古科技大学));
        p.add(r.getStringArray(R.array.周口师范学院));
        p.add(r.getStringArray(R.array.牡丹江师范学院));
        p.add(r.getStringArray(R.array.四川文理学院));
        p.add(r.getStringArray(R.array.南阳理工学院));
        p.add(r.getStringArray(R.array.内蒙古师范大学));
        p.add(r.getStringArray(R.array.山东交通学院));
        p.add(r.getStringArray(R.array.泰山学院));
        p.add(r.getStringArray(R.array.滨州学院));
        p.add(r.getStringArray(R.array.黄山学院));
        p.add(r.getStringArray(R.array.嘉应学院));
        p.add(r.getStringArray(R.array.衢州学院));
        p.add(r.getStringArray(R.array.池州学院));
        p.add(r.getStringArray(R.array.华北科技学院));
        p.add(r.getStringArray(R.array.新疆农业大学));
        p.add(r.getStringArray(R.array.河西学院));
        p.add(r.getStringArray(R.array.湖南工学院));
        p.add(r.getStringArray(R.array.楚雄师范学院));
        p.add(r.getStringArray(R.array.铜陵学院));
        p.add(r.getStringArray(R.array.榆林学院));
        p.add(r.getStringArray(R.array.玉溪师范学院));
        p.add(r.getStringArray(R.array.河南城建学院));
        p.add(r.getStringArray(R.array.天水师范学院));
        p.add(r.getStringArray(R.array.商洛学院));
        p.add(r.getStringArray(R.array.邵阳学院));
        p.add(r.getStringArray(R.array.贵阳学院));
        p.add(r.getStringArray(R.array.湖南科技学院));
        p.add(r.getStringArray(R.array.浙江万里学院));
        p.add(r.getStringArray(R.array.皖西学院));
        p.add(r.getStringArray(R.array.安阳工学院));
        p.add(r.getStringArray(R.array.宜春学院));
        p.add(r.getStringArray(R.array.怀化学院));
        p.add(r.getStringArray(R.array.九江学院));
        p.add(r.getStringArray(R.array.重庆三峡学院));
        p.add(r.getStringArray(R.array.济宁学院));
        p.add(r.getStringArray(R.array.攀枝花学院));
        p.add(r.getStringArray(R.array.滁州学院));
        p.add(r.getStringArray(R.array.桂林航天工业学院));
        p.add(r.getStringArray(R.array.潍坊学院));
        p.add(r.getStringArray(R.array.安徽科技学院));
        p.add(r.getStringArray(R.array.伊犁师范学院));
        p.add(r.getStringArray(R.array.蚌埠学院));
        p.add(r.getStringArray(R.array.平顶山学院));
        p.add(r.getStringArray(R.array.成都工业学院));
        p.add(r.getStringArray(R.array.淮南师范学院));
        p.add(r.getStringArray(R.array.陇东学院));
        p.add(r.getStringArray(R.array.德州学院));
        p.add(r.getStringArray(R.array.赤峰学院));
        p.add(r.getStringArray(R.array.塔里木大学));
        p.add(r.getStringArray(R.array.巢湖学院));
        p.add(r.getStringArray(R.array.铜仁学院));
        p.add(r.getStringArray(R.array.西藏大学));
        p.add(r.getStringArray(R.array.枣庄学院));


        return  p;

    }

    public void click( AutoCompleteTextView   l, ArrayAdapter x,ListView y){
        Resources res=getResources();
        names=res.getStringArray(R.array.name);
        if(l.getText().toString().length()==0)
        {
             school=getD().get(id-1);
             x=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,school);
             y.setAdapter(x);
             id++;
        }
        else
        {
            try{
               texts=l.getText().toString();
               for (int a=0;a<names.length;a++)
                   if(texts.equals(names[a]))
                       id=a;
               school=getD().get(id-1);
               x=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,school);
               y.setAdapter(x);
               System.out.println(school);
             }
            catch (NullPointerException e){
               e.printStackTrace();
              }
         }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dz1=getResources().getStringArray(R.array.武汉工程大学);
        li=(ListView)findViewById(R.id.li);
        ap=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,dz1);
        li.setAdapter(ap);



        fr=getResources().getStringArray(R.array.name);
        lr=(AutoCompleteTextView)findViewById(R.id.ser);
        ap=new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,fr);
        lr.setAdapter(ap);


        got=(Button)findViewById(R.id.btn1);
        got.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(lr,ap,li);
            }
        });





        zh=(Button)findViewById(R.id.zh);
        zh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        shsy=(Button)findViewById(R.id.shsy);
        shsy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Main3Activity.class);
                startActivity(i);
            }
        });

        xk=(Button)findViewById(R.id.xk);
        xk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(i);
            }
        });


    }
}

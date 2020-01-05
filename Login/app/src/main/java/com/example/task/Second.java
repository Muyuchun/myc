package com.example.task;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.myapplication.R;

public class Second extends Activity implements View.OnClickListener {
    private Button btn_back = null;
    private Button btn_search = null;

    private TextView class_1 = null;
    private TextView class_2 = null;
    private TextView class_3 = null;
    private TextView class_4 = null;
    private TextView class_5 = null;
    private TextView class_6 = null;
    private TextView class_7 = null;
    private TextView class_8 = null;
    private TextView class_9 = null;
    private TextView class_10 = null;
    private TextView class_11 = null;
    private TextView class_12 = null;
    private TextView class_13 = null;
    private TextView class_14 = null;
    private TextView class_15 = null;

    private TextView course_info = null;

    private TextView account = null;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btn_back = (Button)findViewById(R.id.back);
        btn_search = (Button)findViewById(R.id.search);

        class_1 = (TextView)findViewById(R.id.class_1);
        class_2 = (TextView)findViewById(R.id.class_2);
        class_3 = (TextView)findViewById(R.id.class_3);
        class_4 = (TextView)findViewById(R.id.class_4);
        class_5 = (TextView)findViewById(R.id.class_5);
        class_6 = (TextView)findViewById(R.id.class_6);
        class_7 = (TextView)findViewById(R.id.class_7);
        class_8 = (TextView)findViewById(R.id.class_8);
        class_9 = (TextView)findViewById(R.id.class_9);
        class_10 = (TextView)findViewById(R.id.class_10);
        class_11 = (TextView)findViewById(R.id.class_11);
        class_12 = (TextView)findViewById(R.id.class_12);
        class_13 = (TextView)findViewById(R.id.class_13);
        class_14 = (TextView)findViewById(R.id.class_14);
        class_15 = (TextView)findViewById(R.id.class_15);

        course_info = (TextView)findViewById(R.id.course_info);
        account = (TextView)findViewById(R.id.account);

        course_info.setMovementMethod(ScrollingMovementMethod.getInstance());
        course_info.setScrollbarFadingEnabled(false);
        btn_search.setOnClickListener(this);
        btn_back.setOnClickListener(this);
        class_1.setOnClickListener(this);
        class_2.setOnClickListener(this);
        class_3.setOnClickListener(this);
        class_4.setOnClickListener(this);
        class_5.setOnClickListener(this);
        class_6.setOnClickListener(this);
        class_7.setOnClickListener(this);
        class_8.setOnClickListener(this);
        class_9.setOnClickListener(this);
        class_10.setOnClickListener(this);
        class_11.setOnClickListener(this);
        class_12.setOnClickListener(this);
        class_13.setOnClickListener(this);
        class_14.setOnClickListener(this);
        class_15.setOnClickListener(this);

        Intent intent =getIntent();
        Bundle bundle= intent.getExtras();
        String Name=bundle.getString("name");
        account.setText(Name);
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.back:
                Intent intent1=new Intent(Second.this,MainActivity.class);
                //创建好之后就可以通过它启动新的Activity
                startActivity(intent1);
                break;
            case R.id.search:
                Intent intent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.baidu.com")
                );
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                break;


            case R.id.class_1:
                course_info.setText("教师：白学智。教育经历\n" +
                        "\n" +
                        "1989年9月-1993年6月，南京大学，大气科学，学士\n" +
                        "\n" +
                        "1993年9月-1996年6月，南京大学，大气科学，硕士 （导师：余志豪教授）\n" +
                        "\n" +
                        "1997年9月-2001年12月，中国科学院海洋研究所，物理海洋学，博士 (导师：胡敦欣院士）\n" +
                        "\n" +
                        "工作经历\n" +
                        "\n" +
                        "1996年7月-1999年6月，中国科学院海洋研究所，研究实习员\n" +
                        "\n" +
                        "1999年7月-2001年9月，中国科学院海洋研究所，助理研究员\n" +
                        "\n" +
                        "2001年10月-2008年3月，中国科学院海洋研究所，副研究员\n" +
                        "\n" +
                        "2005年2月-2006年2月，美国佛罗里达州立大学 COAPS，访问学者\n" +
                        "\n" +
                        "2008年3月-2015年10月，美国密歇根大学/NOAA 大湖环境研究室，Research Fellow \n" +
                        "\n" +
                        "2015年11月至今，河海大学海洋学院，教授，博导\n" +
                        "\n" +
                        "2017年1月-          河海大学海洋学院院长助理\n" +
                        "\n" +
                        "2017年7月-          河海大学海洋学院副院长 ");
                AlertDialog.Builder ab_1=new AlertDialog.Builder(this);
                ab_1.setTitle("课程信息");
                ab_1.setMessage("体育部给学生提供爬树课，这门课程将教会学生：如何安全地爬上任何一棵树，并在上面自由移动，甚至在树木之间灵活穿梭。\n" +
                        "\n");
                ab_1.setPositiveButton("确定",null);
                ab_1.setNegativeButton("取消",null);
                ab_1.show();
                break;
            case R.id.class_2:
                course_info.setText("教师：王召民。个人简历\n" +
                        "\n" +
                        "教育背景\n" +
                        "\n" +
                        "1999年6月-2001年7月：加拿大麦吉尔大学大气与海洋科学系，博士后（导师L. A. MYSAK教授）；\n" +
                        "\n" +
                        "1995年9月-1999年6月：加拿大麦吉尔大学大气与海洋科学系，博士学位（导师L. A. MYSAK.教授）；\n" +
                        "\n" +
                        "1984年9月-1987年7月：南京大学大气科学系，硕士学位（导师黄士松教授）；\n" +
                        "\n" +
                        "1980年9月-1984年7月：南京大学大气科学学院，学士学位。\n" +
                        "\n" +
                        "工作经历\n" +
                        "\n" +
                        "2017年1月至今：河海大学海洋学院，教授；\n" +
                        "\n" +
                        "2012年1月-2016年12月：南京信息工程大学，教授；\n" +
                        "\n" +
                        "2006年1月-2011年12月：英国南极局，终身研究员；\n" +
                        "\n" +
                        "2001年8月-2005年12月：加拿大麦吉尔大学大气与海洋科学系，副研究员；\n" +
                        "\n" +
                        "1999年8月-2001年7月：加拿大麦吉尔大学大气与海洋科学系，博士后；\n" +
                        "\n" +
                        "1987年8月-1995年8月：南京大学大气科学学院，讲师。");
                AlertDialog.Builder ab_2=new AlertDialog.Builder(this);
                ab_2.setTitle("课程信息");
                ab_2.setMessage("《星际迷航》是一部充满哲理的系列剧，学生们观赏《星际迷航》，阅读哲学并仔细讨论这其中的联系，思考这样的问题：时间旅行究竟有没有可能？如果现实与我们的认识彻底相反会怎么样？");
                ab_2.setPositiveButton("确定",null);
                ab_2.setNegativeButton("取消",null);
                ab_2.show();
                break;
            case R.id.class_3:
                course_info.setText("教师：程旭❀。简历\n" +
                        "\n" +
                        "学习经历：\n" +
                        "\n" +
                        "2002.09-2007.06   中国科学院南海海洋研究所     物理海洋学专业  博士（导师：齐义泉研究员）\n" +
                        "\n" +
                        "1998.09-2002.06   南京气象学院应用气象系       应用气象学专业  学士 \n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "工作经历：\n" +
                        "\n" +
                        "2017年2月至今            河海大学海洋学院        教授\n" +
                        "\n" +
                        "2014年12月－             中科院南海海洋研究所    研究员    \n" +
                        "\n" +
                        "2014年8月－2015年8月     美国夏威夷大学          访问学者\n" +
                        "\n" +
                        "2010年2月－2011年2月     美国夏威夷大学          访问学者     \n" +
                        "\n" +
                        "2009年9月－2014年12月    中科院南海海洋研究所    副研究员  \n" +
                        "\n" +
                        "2007年8月－2007年11月    香港城市大学            研究助理   \n" +
                        "\n" +
                        "2007年7月－2009年9月     中科院南海海洋研究所    助理研究员  ");
                AlertDialog.Builder ab_3=new AlertDialog.Builder(this);
                ab_3.setTitle("课程信息");
                ab_3.setMessage("带领学生们去检验J·KRowling的小说中出现的魔法事件，并试图通过物理学原理来解释。");
                ab_3.setPositiveButton("确定",null);
                ab_3.setNegativeButton("取消",null);
                ab_3.show();
                break;
            case R.id.class_4:
                course_info.setText("教师：李根。学习经历：\n" +
                        "\n" +
                        "2007.09-2012.07      中国科学技术大学      大气科学       博士生\n" +
                        "\n" +
                        "2003.09-2007.06      中国科学技术大学      大气科学       本科生 \n" +
                        "\n" +
                        " \n" +
                        "\n" +
                        "工作经历：\n" +
                        "\n" +
                        "2017.12-             河海大学海洋学院                     教授\n" +
                        "\n" +
                        "2013.09-2017.11      中国科学院南海海洋研究所             副研究员\n" +
                        "\n" +
                        "2012.11-2013.08      美国加州大学Scripps海洋研究所        博士后\n" +
                        "\n" +
                        "2012.08-2012.10      美国夏威夷大学                       博士后");
                AlertDialog.Builder ab_4=new AlertDialog.Builder(this);
                ab_4.setTitle("课程信息");
                ab_4.setMessage("从技术角度探索垃圾的分解和处理过程，尤其专注于两类垃圾：" +
                        "腐化的和不腐化的垃圾。同时，学生们也探讨与环境保护相关的社会公正问题，例如垃圾填埋场和焚烧厂总是位于比较贫困的社区，美国印第安人部落就是美国政府处理核废料的理想场所。");
                ab_4.setPositiveButton("确定",null);
                ab_4.setNegativeButton("取消",null);
                ab_4.show();
                break;
            case R.id.class_5:
                course_info.setText("教师：甘小荣（1985—），男，副研究员，就职于河海大学环境学院环境工程系，湖北天门人。2017年毕业于大连理工大学环境工程系，获工学博士学位，同年进入香港理工大学应用物理系、应用生物与化学系任副研究员(Research Associate)。2019年1月到河海大学环境学院任教。\n" +
                        "\n" +
                        "主要从事环境污染的传感检测和环境能源，以及相关的理论计算(DFT和MD)。目前，已在Analytical Chemistry、Biosensors and Bioelectronics、ACS Applied Energy Materials等期刊上发表学术论文15篇，申请专利5项。受邀成为Microchimica Acta审稿人，Science Journal of Analytical Chemistry编委成员(editorial board member)。讲授《大气污染控制工程》、《生态修复工程》、《环境工程前沿技术与应用》、《环境生态与水生态修复》、《地球信息系统》（外）等课程。\n" +
                        "\n" +
                        "电子邮箱：gumphope@hhu.edu.cn");
                AlertDialog.Builder ab_5=new AlertDialog.Builder(this);
                ab_5.setTitle("课程信息");
                ab_5.setMessage("学生们和老师探讨枫糖汁是如何制作的以及这个制作过程自从美国原住民时代就没有改变过。" +
                        "学生们还有机会进入当地的制造厂、餐馆参观制作过程，甚至亲手制作，当然也有许多试吃的机会。");
                ab_5.setPositiveButton("确定",null);
                ab_5.setNegativeButton("取消",null);
                ab_5.show();
                break;
            case R.id.class_6:
                course_info.setText("教师：刘晓东（1972~），男，副教授，硕士生导师，江苏姜堰人。\n" +
                        "\n" +
                        "1995年毕业于华东示范大学，2002年到河海大学任教，2002年和2009年分别获得河海大学硕士和博士学位，曾任河海大学环境学院环境科学系党支部书记。\n" +
                        "\n" +
                        "主要从事污染物在水体中的输运机理、水环境数值模拟及环境规划与评价等方面的研究和教学工作。主持国家自然科学基金项目“自相似枝状河网污染物输移掺混机理及多源反演识别研究” 1项、973子课题1项、国家科技支撑计划子课题1项、国家水体污染控制与治理科技重大专项子课题1项。主持和参加了水环境模拟预测、环境影响评价等工程研究项目30余项；出版了“基于边界拟合下的水流与污染物质输运数值模拟”专著1部；获国家环境保护科学技术奖三等奖、教育部科技进步一等奖、教育部科技进步二等奖等省部级奖3项；发表科研论文50余篇；授权发明专利8项；软件著作权6项。主要开设的课程有 “环境影响评价”、“水环境规划与管理”、“安全监控技术与应用”等，已指导硕研究生10余人。\n" +
                        "\n" +
                        "电子邮箱：xdliu@hhu.edu.cn");
                AlertDialog.Builder ab_6=new AlertDialog.Builder(this);
                ab_6.setTitle("课程信息");
                ab_6.setMessage("包括远足采摘节、经济贸易节、" +
                        "爱心动物节、童心话剧节、欢乐新年节、激荡海洋节、沙滩游戏节、" +
                        "竞技体育节、狂欢学生节、倾情泉水节。远足采摘节的扒地瓜课程，让孩子们在扒地瓜的过程中体验劳动、收获喜悦，" +
                        "在合作分工中培养默契和感情。在经济贸易节里，学生不玩的玩具和图书可以出售；学生从外地带回的特色物品也可以出售；学生在批发市场购买的玩具或用品仍旧可以卖给老师和伙伴……\n" +
                        "\n" +
                        "\n");
                ab_6.setPositiveButton("确定",null);
                ab_6.setNegativeButton("取消",null);
                ab_6.show();
                break;
            case R.id.class_7:
                course_info.setText("教师：李一平，男，1978年出生，湖北荆州人，教授，博导，院长助理，系主任，美国北卡大学（UNC）客座教授。\n" +
                        "\n" +
                        "现就职于河海大学环境学院环境科学系、环境规划与评价研究所。入选2017年江苏省“六大人才高峰”高层次人才培养工程，2016年江苏省“333”高层次人才培养工程、2012年江苏省高校“青蓝工程”中青年学术带头人支撑计划。博士毕业于河海大学环境工程专业，博士后就读于美国沙漠研究所（DRI）和美国内华达大学（UNLV），美国北卡大学（UNC）访问学者。主要从事水环境系统规划评价、河湖富营养化机理及水环境数学模型等方面的研究与应用工作。受聘为美国著名环境流体动力学模型开发团队（EFDC-Explorer）技术顾问，并与该模型开发团队首席科学家Paul Craig在河海大学合作举办了多次EFDC开发与应用培训班；长期与北卡大学国际著名藻类学家Hans Paerl教授围绕湖泊蓝藻水华生长限制性因子以及控制机理方面开展了全方位的合作研究，研究成果发表在Water Research等国际权威期刊上。讲授本科生全英文课程《Introduction to Environment》、留学生和博士生全英文课程《水环境模拟与预测》、《Environmental Planning and Predication》、《生态学原理及应用》等。现为中国水利学会江苏省环境分会副主任委员、中国海洋湖沼学会湖泊分会常务理事、中国地理学会湖泊与湿地分会委员、国际海洋与湖沼协会（ASLO）会员，全球湖泊生态系统观测网络协（GLEON）会员，多个国际和国内杂志编委。作为环保部评估中心常聘专家，参与了国家法规化质量管理模型遴选、地表水环境影响评价技术导则修编、数学模型应用指导教材编写、以及环评工程师考前培训等方面的工作。目前，作为第一负责人承担了国家及省部级自然科学基金类项目10项，其中国家自然科学基金项目4项（3项面上，1项青年）、霍英东教育基金项目（当年全国水环境领域仅资助2项）、江苏省自然科学基金面上项目、教育部博士点基金各1项，以子课题负责人承担了国家“十二五”重大科技专项、科技部973项目、环保部水专项和水利部公益性行业科研项目等。已发表学术期刊论文80余篇，其中SCI收录42篇（第一作者和通讯作者26篇），EI收录25篇，已授权国家专利18项、软件著作权14项、出版专著7部。研究成果先后获得2013年IBM全球共享大学研究奖（当年全球水环境领域仅奖励3项）、2014年南京市自然科学优秀学术论文一等奖和江苏省科技进步二等奖，2016年水利部大禹二等奖等。\n" +
                        "\n" +
                        "办公地点：南京市西康路1号河海大学水利馆B310\n" +
                        "\n" +
                        "电子邮箱：liyiping@hhu.edu.cn\n" +
                        "\n" +
                        "个人主页：http://lyp.cjk3d.net");
                AlertDialog.Builder ab_7=new AlertDialog.Builder(this);
                ab_7.setTitle("课程信息");
                ab_7.setMessage("“你愿意与校长聊天吗？”、“聊什么”、“怎么聊”……" +
                        "设计一学期的聊天话题：我的梦想、我最喜爱的活动、我最喜爱的老师……聊天方式采用现场聊天，有专门的校长聊天时间。聊天根据话题，采取“水族馆式”、“小组合作式”等形式，让孩子畅所欲言。\n" +
                        "\n");
                ab_7.setPositiveButton("确定",null);
                ab_7.setNegativeButton("取消",null);
                ab_7.show();
                break;
            case R.id.class_8:
                course_info.setText("教师：韩龙喜（1964～），男，教授，博士生导师，江苏扬州人。\n" +
                        "\n" +
                        "1986年毕业于河海大学陆地水文专业，1989年、1998年分别获得河海大学环境水力学硕士、水力学及河流动力学博士学位，2001年在香港理工大学任访问学者，2004年任河海大学教授。曾任河海大学环境学院环科系主任、环境水利研究所所长。\n" +
                        "\n" +
                        "主要从事水动力学及扩散质输运数值模拟、水资源保护等方面的教学研究工作。主持多项科研项目，先后负责了水网地区污染机理及控制研究、闸控河流水文水系特征及污染物产汇流机制研究、太湖流域水利工程生态效应研究、三峡大坝施工期水环境决策支持系统、水资源保护方法及应用、三峡库区运行期水动力及泥沙淤积研究、水质应急预警分析技术等研究课题。发表论文90余篇，主持出版专著3部。科研成果获得教育部自然科学奖、江苏省、广东省及陕西省科技进步等奖，交通部、环保部科技进步等奖项等10余项。\n" +
                        "\n" +
                        "电子邮箱：hanlongxi@sina.com");
                AlertDialog.Builder ab_8=new AlertDialog.Builder(this);
                ab_8.setTitle("课程信息");
                ab_8.setMessage("以故事为载体，通过故事所传达的丰富内涵，带给学生头脑风暴。他将故事风暴誉为班级里每天的“思维体操”，让学生讲故事，" +
                        "自由地表达自己的困惑、发现、感受、联想。该课程“推动”讲故事的孩子深入阅读，并有所思考，以达到“一石激起千层浪”的风暴效应。");
                ab_8.setPositiveButton("确定",null);
                ab_8.setNegativeButton("取消",null);
                ab_8.show();
                break;
            case R.id.class_9:
                course_info.setText("教师：袁旭音（1964~），男，教授，博士生导师，江苏省“333”第三层次培养对象。江苏无锡人。\n" +
                        "\n" +
                        "1985年毕业于南京大学地球科学系，获学士学位；1988年毕业于中国地质科学院研究生院，获硕士学位；2003年毕业于南京大学地球科学与工程学院，获博士学位。1988年-2003年在国土资源部南京地质矿产研究所工作，2004年至今任职于河海大学环境学院，曾任环境工程系系主任。2009年-2010年作为访问学者在美国宾州州立大学进行访问研究。\n" +
                        "\n" +
                        "主要从事流域污染物迁移转化及环境效应、土壤污染的生态效应与修复和区域环境评价的研究工作。主持国家自然科学基金“多因素影响下河道悬浮物的物源定量判别及对营养物的控制作用研究”等5项国家基金、主持和参与“中国矿物碳汇潜力研究”、“长江三角洲典型地面沉降区水土污染机理研究与防治技术探索”等科技部和国土资源部基金项目8项，主持和参与“岩土水生态环境现状调查研究”等社会服务项目10余项；获国土资源部科技进步二等奖、江苏省优秀教学成果二等奖等省部级奖3项；已发表学术论文120余篇，其中SCI论文32篇，EI论文25篇，申请发明专利11项。开设的课程有“环境监测”、“环境经济学”、“地下水介质污染与控制”等，指导博、硕士研究生50余人。\n" +
                        "\n" +
                        "担任的社会工作有：江苏省环境工程中心咨询专家、中国环境学会水环境分会理事、江苏省农业地质学会理事。\n" +
                        "\n" +
                        "电子邮箱：yxy_hjy@hhu.edu.cn\n" +
                        "\n");
                AlertDialog.Builder ab_9=new AlertDialog.Builder(this);
                ab_9.setTitle("课程信息");
                ab_9.setMessage("组织学生观看《小蝌蚪找妈妈》、《狐狸打猎人》、《雪孩子》等多部动画片，让学生了解中国动画曾经的辉煌，并用国画、木偶、剪纸等多种形式进行创作。");
                ab_9.setPositiveButton("确定",null);
                ab_9.setNegativeButton("取消",null);
                ab_9.show();
                break;
            case R.id.class_10:
                course_info.setText("教师：许航，男，1981年出生，教授，博导。现就职于环境学院市政工程系、现代水处理技术研究所。主要从事城市节水与污废水安全再利用、饮用水安全保障、水处理膜材料研发等方面的科研，主持承担国家自然科学基金青年项目、面上项目、国家博士后特别资助项目和国家重大水专项等国家与省部级课题10项，并在《Water Research》《Chemical Engineering Journal》和《Desalination》等杂志发表论文60余篇（SCI检索30篇），申请和授权专利30余项，研究成果获得江苏省科技进步二等奖1项和教育部科技进步二等奖2项。\n" +
                        "\n" +
                        "邮箱：xuhang810826@hhu.edu.cn");
                AlertDialog.Builder ab_10=new AlertDialog.Builder(this);
                ab_10.setTitle("课程信息");
                ab_10.setMessage("在这里，学生通过团队合作，使用钉锤、老虎钳等简单工具，利用木板、冰棒棍等材料制作出活灵活现的“机械兽”。" +
                        "该课程既是以创意设计和动手制作为主要内容的科创项目，也是培养“快乐的小主人”的校本课程。" +
                        "课程设置了5个板块，包括文化与概况、原理与工艺、核心技术、造型设计、竞赛与展示。");
                ab_10.setPositiveButton("确定",null);
                ab_10.setNegativeButton("取消",null);
                ab_10.show();
                break;
            case R.id.class_11:
                course_info.setText("教师：王永花（1984~），女，副教授，硕士生导师。安徽合肥人。\n" +
                        "\n" +
                        "2005年毕业于中南林业科技大学，同年9月到南京大学环境学院硕博连读，2010年获得南京大学博士学位，同年6月到河海大学环境学院任教。\n" +
                        "\n" +
                        "主要从事环境中痕量有毒有害污染物的新型分析方法及生物效应研究等方面的研究工作。主持国家及省部级自然科学基金类项目3项；获教育部自然科学二等奖和江苏省高校科学技术一等奖，河海大学第21届教师讲课竞赛一等奖；已发表学术期刊论文30余篇，其中SCI收录22篇，申请发明专利9项。主要开设的课程有“有机化学”、“大型仪器应用技术”等，已指导硕士研究生近10人。\n" +
                        "\n" +
                        "电子邮箱：mgflora@hhu.edu.cn");
                AlertDialog.Builder ab_11=new AlertDialog.Builder(this);
                ab_11.setTitle("课程信息");
                ab_11.setMessage("以“阳光足球、快乐童年”的理念，全面打造足球特色校本课程。" +
                        "学校成立了“班级、年级、学校”三级足球队，每个年级成立足球兴趣班，每周举行一次班级足球对抗赛，每月邀请兄弟学校进行足球友谊赛，甚至与外省市足球特色学校互访。");
                ab_11.setPositiveButton("确定",null);
                ab_11.setNegativeButton("取消",null);
                ab_11.show();
                break;
            case R.id.class_12:
                course_info.setText("教师：倪利晓(1973-),女,教授,硕士生导师,河南洛阳人。\n" +
                        "\n" +
                        "1998年和2001年分别获得河南师范大学本科和硕士学位，2004年获得南京大学博士学位，现任河海大学环境工程系系主任。\n" +
                        "\n" +
                        "主要从事蓝藻水华控制技术与机理、污染物迁移转化及人工湿地处理技术等方面的研究与应用工作。讲授《水处理工程II》、《工业废水处理》、《Water  Pollution  Control》等课程。目前，作为第一负责人承担和参与国家及省部级自然科学基金类项目10余项，其中国家自然科学基金项目1项，参与国家自然科学基金重点项目1项。已发表第一作者学术期刊论文30余篇，其中SCI收录20余篇，已授权国家发明专利10余项。已指导硕士研究生30余人。\n" +
                        "\n" +
                        "担任的社会工作主要有：“中国环境科学学会”会员、“湖泊科学”、“Chemosphere”等多个杂志审稿人。\n" +
                        "\n" +
                        "电子邮箱：nilixiao@hhu.edu.cn");
                AlertDialog.Builder ab_12=new AlertDialog.Builder(this);
                ab_12.setTitle("课程信息");
                ab_12.setMessage("学生们完成的数字模型作品及交流点评丰富多彩。学校结合3D发展形势与学生实际需求，将课程分为4个层次：第一层是掌握3D作图软件的基本操作方法，第二层是掌握3D基本模型制作，第三层是完成生活实例制作训练，第四层是通过交流、实践打印出头脑中思考的东西。" +
                        "经过一学期的课程实践，孩子们已经能通过建模软件，将自己的想法以模型的方式呈现在电脑上，并通过3D打印机进行打印。");
                ab_12.setPositiveButton("确定",null);
                ab_12.setNegativeButton("取消",null);
                ab_12.show();
                break;
            case R.id.class_13:
                course_info.setText("教师：刘成（1977~），男，教授，博士生导师。山东济南人。\n" +
                        "\n" +
                        "2007年同济大学市政工程专业博士毕业，获得博士学位。同年到河海大学环境学院任教，2015年普渡大学访学1年，现任职于河海大学环境学院市政工程系、现代水处理技术研究所，现任市政工程系系主任。\n" +
                        "\n" +
                        "主要研究方向为城市饮用水安全保障、城市污水深度处理、特殊水质地下水处理、特种行业工业用水及废水处理和水环境改善技术及理论研究。讲授《水处理微生物学基础》、《水资源利用与保护》等课程。目前，作为第一负责人承担了包括国家自然科学基金、国家科技支撑、国家水专项等在内的国家级和省部级等科研项目数十余项。已发表学术期刊论文80余篇，其中SCI收录20余篇，已授权国家发明专利45项。研究成果先后获得江苏省科技进步二等奖、三等奖、教育部科技进步奖二等奖以及淮河科技奖二等奖各1项。入选河海大学第三批优秀创新人才计划、省智力支持宿迁“双百工程”优秀专家、苏北发展“特聘专家”、江苏省第14批“六大高峰人才”。\n" +
                        "\n" +
                        "电子邮箱：liucheng8791@hhu.edu.cn");
                AlertDialog.Builder ab_13=new AlertDialog.Builder(this);
                ab_13.setTitle("课程信息");
                ab_13.setMessage("超越界限，众生平等”、“活着的姿态”、“动人亲情是永恒的”、“浮华的年代里，我们怎样认识爱情”……" +
                        "学校组织学生统一观影，举办主题晨会、班会、沙龙，开展观后主题征文、评比，编辑影视德育专刊、黑板报，自主开发经典影视清单与学生分享，观后推荐同类经典作品再欣赏。");
                ab_13.setPositiveButton("确定",null);
                ab_13.setNegativeButton("取消",null);
                ab_13.show();
                break;
            case R.id.class_14:
                course_info.setText("教师：操家顺（1964~），男，教授，博士生导师，注册环评工程师。浙江省嵊州市人。\n" +
                        "\n" +
                        "1988年毕业于湘潭大学环境工程专业，1988.6~1995.11，南京化学工业集团公司研究院工作，工程师。1995.11~至今，河海大学环境学院任教，期间分别获得硕士和博士学位，2000年赴DELF理工大学作访问学者。污水资源化与低碳发展技术研究所所长，市政工程学科副主任，兼任河海大学设计研究院有限公司副总工程师，曾任市政工程系主任。\n" +
                        "\n" +
                        "专业从事水污染控制与水环境修复理论与技术研究。负责国家863重大科技专项、水污染控制重大科技专项、教育部科技创新工程重大项目和省自然科学基金、科技攻关、重点环保科研课题、太湖治理示范项目等科研课题40余项，其中城镇污水生物脱氮除磷技术获得省科技成果转化并实现产业化。获国家发明二等奖1项，国家科技进步二等奖1项，全国优秀咨询成果三等奖1项，华夏建设科技二等奖1项，中国纺织工业联合会科技进步二等奖1项，江苏省环保科技二等奖1项；发表论文90余篇，译著1部；申请发明专利48件，授权发明专利26件；申请软件著作权2件。主要开设的课程有“水处理工程”、“水污染控制理论与技术”、“污水生物处理理论与技术”（双语）等，获国家级教学成果二等奖1项，教育部“精品视频公开课”1门，指导本科生毕业设计获得江苏省优秀毕业设计一等奖1项，主编教材1部，参编2部；已指导博、硕士80余人。\n" +
                        "\n" +
                        "担任的社会工作主要有：江苏省土木建筑学会给水排水委员会理事，中国环境学会南京环境工程委员会理事，节能降耗水处理装备产业技术创新战略联盟专家委员会委员。\n" +
                        "\n" +
                        "电子邮箱：caojiashun@163.com");
                AlertDialog.Builder ab_14=new AlertDialog.Builder(this);
                ab_14.setTitle("课程信息");
                ab_14.setMessage("以向学生的心灵播撒阳光为目的，以关于心理健康的行为故事、活动、游戏为载体，以品格训练为重点，对学生进行“心教育”。它涵盖了儿童成长过程中的多个主题，每个主题由3个模块（小故事+小活动+小游戏）组成。" +
                        "例如，在主题“合作真好”下，分为3个小模块——心教育小故事“魔法汤石”、心教育小活动“十面埋伏”和心教育小游戏“众志成城”。它是一个课程模式，更是一个心教育模式，在实际操作层面上实现了心教育理念的落地。");
                ab_14.setPositiveButton("确定",null);
                ab_14.setNegativeButton("取消",null);
                ab_14.show();
                break;
            case R.id.class_15:
                course_info.setText("教师：牛丽华（1986-），女，副教授，硕士生导师，山东临沂人。\n" +
                        "\n" +
                        "2013年，博士毕业于山东农业大学/中国科学院动物研究所（联培）；2016年，在河海大学环境科学与工程博士后流动站出站；2017年至今，就职于河海大学环境学院，环境微生物研究所。\n" +
                        "\n" +
                        "主要从事河流微生物生态和河流生态健康评价等方面的研究和教学工作。主持国家自然科学基金地区基金项目“高原地区城市污水处理厂活性污泥特征解析及性能研究”、青年基金项目“河流生态健康评价的底质微生物生物完整性指数方法研究”等5项基金，参加国家及省部级基金项目6项。已发表SCI论文30余篇，申请/授权国家发明专利10余项。入选河海大学“大禹学者”第四层次。\n" +
                        "\n" +
                        "讲授本科生《环境微生物学》、《环境微生物学实验》和留学生《Theory of Aquatic Biology》等课程。\n" +
                        "\n" +
                        "办公地点：水利馆B318\n" +
                        "\n" +
                        "电子邮箱：niulh@hhu.edu.cn");
                AlertDialog.Builder ab_15=new AlertDialog.Builder(this);
                ab_15.setTitle("课程信息");
                ab_15.setMessage("样和别人友好相处？怎样控制好自己的脾气？……这些学生经常面临的问题，都能够在情商课上找到答案。编写《托起心中的小太阳——青少年情商知识读本》等。" +
                        "根据不同年龄段孩子的心理和认知特征，“情商读本”的侧重点也不尽相同，如低年级的“情商读本”配有汉语拼音和生动的图片，让孩子更容易理解读本内容，而初中生的“情商读本”则更多地关注青春期的一些心理特征。");
                ab_15.setPositiveButton("确定",null);
                ab_15.setNegativeButton("取消",null);
                ab_15.show();
                break;

        }
    }
}

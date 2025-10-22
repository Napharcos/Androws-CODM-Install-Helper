const val KEYMAP_CONTENT_145_175 = """
<KeyMapSolution SolutionID="{&quot;id&quot;:&quot;1752061764155&quot;,&quot;type&quot;:0}" SolutionName="团队竞技模式" InputType="1" SilentUpdate="0">
<KeyMapping ItemName="Right Click" Point_X="0.874219" Point_Y="0.541667" Description="右键开镜" Remark="" MiniVisiable="false" MiniDisable="false" ShowOnLockAsciiCode="192" AsciiCode="-2">
<SwitchOperation Description="导弹齐射" EnableSwitch="MissileVolley" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.944531" Point_Y="0.506944"/>
<SwitchOperation Description="下车" EnableSwitch="GetOutCar" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.046875" Point_Y="0.637500"/>
<SwitchOperation Description="影刃" EnableSwitch="ShadowBlade" DisableSwitch="ReturnSetUp" Point_X="0.874219" Point_Y="0.541667" HideTips="1"/>
<SwitchOperation Description="瞄准" EnableSwitch="Sniper" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.874219" Point_Y="0.541667" HideTips="1"/>
<SwitchOperation Description="取消瞄准" EnableSwitch="Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.874219" Point_Y="0.541667" HideTips="1"/>
<SwitchOperation Description="刀" EnableSwitch="Knife" DisableSwitch="ReturnSetUp" Point_X="0.060937" Point_Y="0.519444" HideTips="1"/>
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp" Point_X="0.874219" Point_Y="0.541667" HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="%tabName" Point_X="0.049219" Point_Y="0.084722" Description="背包" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%tabCode">
<SwitchOperation Description="取消释放弓箭/盾牌" EnableSwitch="Bow|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444"/>
<SwitchOperation Description="盾牌" EnableSwitch="Shield1|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444"/>
<SwitchOperation Description="暴风雨" EnableSwitch="Rainstorm|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444"/>
<SwitchOperation Description="歼灭者" EnableSwitch="Annihilator|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444"/>
<SwitchOperation Description="战绩面板" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf" Point_X="0.049219" Point_Y="0.084722"/>
</KeyMapping>
<KeyMapping ItemName="%escName" Point_X="0.765625" Point_Y="0.050000" Description="打开设置" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%escCode">
<SwitchOperation Description="关闭躲猫猫介绍" EnableSwitch="Cartoon" Point_X="0.916406" Point_Y="0.209722"/>
<SwitchOperation Description="返回设置" EnableSwitch="ReturnSetUp" Point_X="0.033203" Point_Y="0.052083"/>
<SwitchOperation Description="关闭设置" EnableSwitch="InSetUp" Point_X="0.775000" Point_Y="0.504167" TexturePosition="InSetUp"/>
<SwitchOperation Description="选择手雷解锁鼠标（爆破模式）" EnableSwitch="Boomf" Point_X="0.049219" Point_Y="0.084722"/>
<SwitchOperation Description="打开设置" EnableSwitch="SetUp" DisableSwitch="InSetUp|ReturnSetUp" Point_X="0.765625" Point_Y="0.050000"/>
</KeyMapping>
<KeyMapping ItemName="%spaceName" Point_X="0.958008" Point_Y="0.675347" Description="跳跃" Remark="" MiniVisiable="true" MiniDisable="false" AsciiCode="%spaceCode">
<SwitchOperation Description="下车" EnableSwitch="GetOutCar" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.942187" Point_Y="0.670000"/>
<SwitchOperation Description="跳跃" EnableSwitch="Jump" DisableSwitch="ReturnSetUp" HideTips="1"/>
<SwitchOperation Description="跳跃" EnableSwitch="SetUp" DisableSwitch="InSetUp|ReturnSetUp|Knife2|HangUp" Point_X="0.938008" Point_Y="0.675347" HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="%1Name" Point_X="0.494531" Point_Y="0.876389" Description="换1号武器" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%1Code">
<SwitchOperation Description="换1号武器" EnableSwitch="Jump" DisableSwitch="Boomf" Point_X="0.494531" Point_Y="0.876389"/>
<SwitchOperation Description="换1号武器" EnableSwitch="Reload" DisableSwitch="Boomf" Point_X="0.494531" Point_Y="0.876389"/>
</KeyMapping>
<KeyMapping ItemName="%2Name" Point_X="0.618750" Point_Y="0.883333" Description="换2号武器" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%2Code">
<SwitchOperation Description="换2号武器" EnableSwitch="Jump" DisableSwitch="Boomf" Point_X="0.618750" Point_Y="0.883333"/>
<SwitchOperation Description="换2号武器" EnableSwitch="Reload" DisableSwitch="Boomf" Point_X="0.618750" Point_Y="0.883333"/>
</KeyMapping>
<KeyMapping ItemName="%3Name" Point_X="0.406250" Point_Y="0.880556" Description="空对地导弹" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%3Code">
<SwitchOperation Description="扫描" EnableSwitch="Jump" DisableSwitch="Boomf" Point_X="0.406250" Point_Y="0.880556"/>
<SwitchOperation Description="扫描" EnableSwitch="Reload" DisableSwitch="SwitchMode4|Boomf" Point_X="0.406250" Point_Y="0.880556"/>
</KeyMapping>
<KeyMapping ItemName="%4Name" Point_X="0.350781" Point_Y="0.884722" Description="飞机雷" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%4Code">
<SwitchOperation Description="飞机雷" EnableSwitch="Jump" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.350781" Point_Y="0.884722"/>
<SwitchOperation Description="飞机雷" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.350781" Point_Y="0.884722"/>
</KeyMapping>
<KeyMapping ItemName="%5Name" Point_X="0.290625" Point_Y="0.893056" Description="扫描" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%5Code">
<SwitchOperation Description="空对地导弹" EnableSwitch="Jump" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.290625" Point_Y="0.893056"/>
<SwitchOperation Description="空对地导弹" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.290625" Point_Y="0.893056"/>
</KeyMapping>
<KeyMapping ItemName="%6Name" Point_X="0.349609" Point_Y="0.824653" Description="扫描" Remark="" MiniVisiable="true" MiniDisable="false" AsciiCode="%6Code">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.406250" Point_Y="0.830000"/>
</KeyMapping>
<KeyMapping ItemName="%7Name" Point_X="0.406250" Point_Y="0.824653" Description="扫描" Remark="" MiniVisiable="true" MiniDisable="false" AsciiCode="%7Code">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.349609" Point_Y="0.830000"/>
</KeyMapping>
<KeyMapping ItemName="%tName" Point_X="0.672500" Point_Y="0.681111" Description="引爆" Remark="" MiniVisiable="true" MiniDisable="false" AsciiCode="%tCode">
<SwitchOperation Description="上飞" EnableSwitch="FlyUp" DisableSwitch="XBtn|MapOpenFlag|InSetUp|BreastPatting|ReturnSetUp|SkillX" Point_X="0.942187" Point_Y="0.580000"/>
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.672500" Point_Y="0.681111"/>
</KeyMapping>
<KeyMapping ItemName="%cName" Point_X="0.852539" Point_Y="0.918403" Description="下蹲" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%cCode">
<SwitchOperation Description="下蹲" EnableSwitch="Squat" DisableSwitch="Boomf" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
<SwitchOperation Description="取消下蹲" EnableSwitch="CancelSquat" DisableSwitch="Boomf" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
<SwitchOperation Description="取消趴下" EnableSwitch="CancelFall" DisableSwitch="Boomf" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
<SwitchOperation Description="翻滚" EnableSwitch="Roll" DisableSwitch="Boomf" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="%eName" Point_X="0.458594" Point_Y="0.694444" Description="拆弹" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%eCode">
<SwitchOperation Description="直升机炮手" EnableSwitch="gunner" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.738750" Point_Y="0.552222"/>
<SwitchOperation Description="感应弹" EnableSwitch="Induction" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.800781" Point_Y="0.677778"/>
<SwitchOperation Description="拆弹" EnableSwitch="BombDisposal" DisableSwitch="Boomf" Point_X="0.458594" Point_Y="0.694444"/>
<SwitchOperation Description="下飞" EnableSwitch="FlyDown" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|" Point_X="0.759375" Point_Y="0.681111"/>
<SwitchOperation Description="技能" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.942187" Point_Y="0.347222"/>
<SwitchOperation Description="安装炸弹" EnableSwitch="Bomb1" DisableSwitch="Boomf" Point_X="0.458594" Point_Y="0.694444"/>
</KeyMapping>
<KeyMapping ItemName="%fName" Point_X="0.175000" Point_Y="0.386111" Description="取消丢雷" Remark="" MiniVisiable="true" MiniDisable="false" NoDelete="1" SpecialFunc="1002" OpGuidClass="0" AsciiCode="%fCode">
<SwitchOperation Description="盾牌炮塔" EnableSwitch="Hand2|YellowTriangle" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.503906" Point_Y="0.702778"/>
<SwitchOperation Description="换形（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.729688" Point_Y="0.830556"/>
<SwitchOperation Description="空投（一击必杀）" EnableSwitch="Airdrop3" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.503145" Point_Y="0.696078"/>
<SwitchOperation Description="切换位置" EnableSwitch="SwitchingPosition" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.043750" Point_Y="0.731944" TexturePosition="SwitchingPosition"/>
<SwitchOperation Description="扔回丢雷" EnableSwitch="BackGrenade" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.744531" Point_Y="0.611111" TexturePosition="BackGrenade"/>
<SwitchOperation Description="取消丢雷" EnableSwitch="CancelFireTheHole" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.175000" Point_Y="0.386111" TexturePosition="CancelFireTheHole"/>
<SwitchOperation Description="换武器" EnableSwitch="SwitchWeapon" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.508594" Point_Y="0.776389"/>
<SwitchOperation Description="无畏战士" EnableSwitch="XS1Goliath" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.522656" Point_Y="0.694444"/>
<SwitchOperation Description="取消" EnableSwitch="YellowTriangle" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.597656" Point_Y="0.698611" TexturePosition="YellowTriangle"/>
<SwitchOperation Description="拾取防爆装置" EnableSwitch="TrophySystem|OpenFunction" DisableSwitch="InSetUp|ReturnSetUp|Knife2" Point_X="0.516406" Point_Y="0.695833" TexturePosition="TrophySystem"/>
<SwitchOperation Description="打开空投" EnableSwitch="Airdrop" DisableSwitch="ReturnSetUp|Knife2|Boomf" Point_X="0.503906" Point_Y="0.695833"/>
<SwitchOperation Description="盾牌炮塔拿起" EnableSwitch="Turret|Turret1" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.792188" Point_Y="0.591667"/>
<SwitchOperation Description="下车" EnableSwitch="GetOutCar" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.943750" Point_Y="0.376389"/>
<SwitchOperation Description="换背包" EnableSwitch="SwitchBackpage" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.508594" Point_Y="0.776389" TexturePosition="SwitchBackpage"/>
<SwitchOperation Description="开启功能" EnableSwitch="OpenFunction" DisableSwitch="ReturnSetUp|Boomf" TexturePosition="OpenFunction"/>
<SwitchOperation Description="使用核弹" EnableSwitch="Missile" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.792188" Point_Y="0.591667" TexturePosition="Missile"/>
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|ReturnSetUp|Boomf" Point_X="0.503906" Point_Y="0.695833"/>
</KeyMapping>
<KeyMapping ItemName="%qName" Point_X="0.700000" Point_Y="0.893056" Description="手雷" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%qCode">
<SwitchOperation Description="盾牌炮塔" EnableSwitch="Turret" DisableSwitch="ReturnSetUp|Boomf|" Point_X="0.765766" Point_Y="0.616000" TexturePosition="Turret"/>
<SwitchOperation Description="盾牌炮塔" EnableSwitch="Turret1" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.765766" Point_Y="0.616000" TexturePosition="Turret1"/>
<SwitchOperation Description="手雷" EnableSwitch="Jump" DisableSwitch="ReturnSetUp|Cartoon|Boomf" Point_X="0.700000" Point_Y="0.893056"/>
<SwitchOperation Description="手雷" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.700000" Point_Y="0.893056"/>
</KeyMapping>
<KeyMapping ItemName="%mName" Point_X="0.970313" Point_Y="0.062500" Description="打开地图" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%mCode">
<SwitchOperation Description="打开地图" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf" Point_X="0.967969" Point_Y="0.079167"/>
</KeyMapping>
<KeyMapping ItemName="%gName" Point_X="0.680469" Point_Y="0.822222" Description="切换手雷" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%gCode">
<SwitchOperation Description="闪光弹（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp" Point_X="0.824686" Point_Y="0.914566"/>
<SwitchOperation Description="切换手雷" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp" Point_X="0.680469" Point_Y="0.822222"/>
</KeyMapping>
<KeyMapping ItemName="%rName" Point_X="0.756836" Point_Y="0.824653" Description="换弹" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%rCode">
<SwitchOperation Description="假身（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.734375" Point_Y="0.661111"/>
<SwitchOperation Description="换弹" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|Boomf" TexturePosition="Reload"/>
</KeyMapping>
<KeyMapping ItemName="%vName" Point_X="0.758594" Point_Y="0.644444" Description="快速挥刀" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%vCode">
<SwitchOperation Description="快速挥刀" EnableSwitch="Knife|Reload" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444"/>
<SwitchOperation Description="快速挥刀" EnableSwitch="Knife|Sniper" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444"/>
<SwitchOperation Description="快速挥刀" EnableSwitch="Knife|Sniper2" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444"/>
<SwitchOperation Description="快速挥刀" EnableSwitch="Knife|SwitchMode3" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444"/>
<SwitchOperation Description="爬楼梯（团队模式）" EnableSwitch="Stair" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.794382" Point_Y="0.587000" TexturePosition="Stair"/>
</KeyMapping>
<KeyMapping ItemName="%ctrlName" Point_X="0.951562" Point_Y="0.825000" Description="趴下" Remark="" MiniVisiable="true" MiniDisable="false" AsciiCode="%ctrlCode">
<SwitchOperation Description="趴下" EnableSwitch="Fall" DisableSwitch="InSetUp" Point_X="0.967057" Point_Y="0.940104" HideTips="1"/>
<SwitchOperation Description="取消趴下" EnableSwitch="CancelFall" DisableSwitch="InSetUp" Point_X="0.967057" Point_Y="0.940104" HideTips="1"/>
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.950625" Point_Y="0.884444" HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="%zName" Point_X="0.767969" Point_Y="0.220833" Description="语音按住" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%zCode">
<SwitchOperation Description="语音按住" EnableSwitch="Voice" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMapping>
<KeyMapping ItemName="%f4Name" Point_X="0.722656" Point_Y="0.045833" Description="字母键" MiniVisiable="true" MiniDisable="false" AsciiCode="%f4Code">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.722656" Point_Y="0.045833"/>
</KeyMapping>
<KeyMapping ItemName="%oName" Point_X="0.769531" Point_Y="0.315278" Description="加速跑" Remark="" MiniVisiable="true" MiniDisable="false" AsciiCode="%oCode">
<SwitchOperation Description="加速跑" EnableSwitch="Run" DisableSwitch="ReturnSetUp|Boomf" TexturePosition="Run"/>
<SwitchOperation Description="夜视仪开" EnableSwitch="Nightvision" DisableSwitch="ReturnSetUp" TexturePosition="Nightvision"/>
<SwitchOperation Description="夜视仪关" EnableSwitch="Nightvision1" DisableSwitch="ReturnSetUp" TexturePosition="Nightvision1"/>
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.769531" Point_Y="0.315278"/>
</KeyMapping>
<KeyMappingEx ItemName="WASD" Point_X="0.190625" Point_Y="0.713889" Description="移动" Remark="" MiniVisiable="false" MiniDisable="false" HideTipsAlways="1" Type="CrossKey" UP_AsciiCode="87" DOWN_AsciiCode="83" LEFT_AsciiCode="65" RIGHT_AsciiCode="68" Offset="0.070258" ShiftOffset="0.100000" Speed="0.000000">
<SwitchOperation Description="Move" EnableSwitch="SetUp"/>
</KeyMappingEx>
<KeyMappingEx ItemName="Left Mouse Button" Point_X="0.060937" Point_Y="0.519444" Description="开火" Remark="" MiniVisiable="false" MiniDisable="false" AutoActive="1" Type="LClick" LOCK_AsciiCode="%lockMouseCode">
<SwitchOperation Description="下飞" EnableSwitch="FlyDown" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|" Point_X="0.060937" Point_Y="0.519444" HideTips="1"/>
<SwitchOperation Description="锁定（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.848437" Point_Y="0.709722"/>
<SwitchOperation Description="弓箭" EnableSwitch="Bow" DisableSwitch="BreastPatting|ReturnSetUp|SelectFireMode" Point_X="0.854688" Point_Y="0.745833"/>
<SwitchOperation Description="下车" EnableSwitch="GetOutCar" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.942187" Point_Y="0.580000"/>
<SwitchOperation Description="射击" EnableSwitch="SetUp" DisableSwitch="BreastPatting|ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444" HideTips="1"/>
<SwitchOperation Description="射击" EnableSwitch="Reload" DisableSwitch="BreastPatting|ReturnSetUp|SelectFireMode|Boomf" Point_X="0.060937" Point_Y="0.519444" HideTips="1"/>
</KeyMappingEx>
<KeyMappingEx ItemName="Move with Mouse" Point_X="0.661719" Point_Y="0.369444" Description="视角" Remark="" MiniVisiable="false" MiniDisable="false" HideTipsAlways="1" AutoActive="1" Raw="1" Type="RClick" Offset="0.450000" LOCK_AsciiCode="%lockMouseCode" AsciiCode="%lockMouseCode" MouseResetTime="1000" Sensi_X="1.000000" Sensi_Y="1.000000">
<SwitchOperation Description="视角" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
<SwitchOperation Description="视角" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
<SwitchOperation Description="视角" EnableSwitch="SteeringWheel" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
</KeyMappingEx>
<KeyMappingEx ItemName="%iName" Point_X="0.867969" Point_Y="0.318056" Description="信号" Remark="" MiniVisiable="false" MiniDisable="false" NoDelete="1" SpecialFunc="0" OpGuidClass="0" InUseDisableView="1" Type="KeyMove" Offset="0.490000" Click_X="0.867969" Click_Y="0.318056" Click_Offset="0.450000" AsciiCode="%iCode" Cancel_X="-0.911133" Cancel_Y="-0.277778" Click_Left="1" ReleaseNow="0" RadiusOffset="1.000000" RadiusRatio="0.079808" Version="2.0" SkillRangeA="1.000000" SkillRangeB="1.000000" Center_X="0.000000" Center_Y="0.000000" StopMoving="0" NeedPressed="1" ReleaseMode="-1" KeyMoveMode="-1" UseMousePos="0" Center_XY_Disable="1" Speed="0.000000" Sensi_X="1.000000" Sensi_Y="1.000000" IsObserve="0" UseDefaultCancelKey="1" Delay="0">
<SwitchOperation Description="信号" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMappingEx ItemName="Click with Scroll Wheel" Point_X="0.618750" Point_Y="0.883333" Description="滚轮切枪" Remark="" MiniVisiable="false" MiniDisable="false" HideTipsAlways="1" Type="WheelClick" Click_X="0.494531" Click_Y="0.876389">
<SwitchOperation Description="跳跃" EnableSwitch="Jump" DisableSwitch="ReturnSetUp"/>
<SwitchOperation Description="换弹" EnableSwitch="Reload" DisableSwitch="ReturnSetUp"/>
</KeyMappingEx>
<KeyMappingEx ItemName="%lName" Point_X="0.767188" Point_Y="0.138889" Description="开启/关闭广播" Remark="" MiniVisiable="false" MiniDisable="false" Type="MultiPoint" AsciiCode="%lCode">
<Point Point_X="0.614062" Point_Y="0.130556" Delay="300" IsMutex="1" MutexVal="1" IsRepeat="0" RepeatType="0" RepeatCount="0"/>
<Point Point_X="0.677344" Point_Y="0.130556" Delay="300" IsMutex="1" MutexVal="0" IsRepeat="0" RepeatType="0" RepeatCount="0"/>
<SwitchOperation Description="开启/静音广播" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMappingEx ItemName="%zName" Point_X="0.767969" Point_Y="0.220833" Description="开启/关闭语音" Remark="" MiniVisiable="false" MiniDisable="false" Type="MultiPoint" AsciiCode="%zCode">
<Point Point_X="0.580469" Point_Y="0.233333" Delay="300" IsMutex="1" MutexVal="1" IsRepeat="0" RepeatType="0" RepeatCount="0"/>
<Point Point_X="0.715625" Point_Y="0.233333" Delay="300" IsMutex="1" MutexVal="0" IsRepeat="0" RepeatType="0" RepeatCount="0"/>
<SwitchOperation Description="开启/关闭语音" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Voice|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMapping ItemName="%capsName" Point_X="0.739375" Point_Y="0.587778" Description="Execution" Remark="" MiniVisiable="true" MiniDisable="false" AsciiCode="%capsCode">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.739375" Point_Y="0.587778"/>
<SwitchOperation Description="" EnableSwitch="" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.739375" Point_Y="0.587778" HideTips="1"/>
</KeyMapping>
</KeyMapSolution>
"""

//Gundam
const val KEYMAP_CONTENT_145_566 = """
<KeyMapping ItemName="Right Click" Point_X="0.767969" Point_Y="0.846667" Description="Right Click" MiniVisiable="true" MiniDisable="false" ShowOnLockAsciiCode="192" AsciiCode="-2">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.767969" Point_Y="0.846667"/>
</KeyMapping>
<KeyMapping ItemName="%tabName" Point_X="0.501875" Point_Y="0.048889" Description="字母键" MiniVisiable="true" MiniDisable="false" AutoCancel="0" AsciiCode="%tabCode">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.501875" Point_Y="0.048889"/>
</KeyMapping>
<KeyMapping ItemName="%escName" Point_X="0.770471" Point_Y="0.040968" Description="打开设置" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%escCode">
<SwitchOperation Description="关闭躲猫猫介绍" EnableSwitch="Cartoon" Point_X="0.916406" Point_Y="0.209722"/>
<SwitchOperation Description="返回设置" EnableSwitch="ReturnSetUp" Point_X="0.033203" Point_Y="0.052083"/>
<SwitchOperation Description="关闭设置" EnableSwitch="InSetUp" Point_X="0.775000" Point_Y="0.504167" TexturePosition="InSetUp"/>
<SwitchOperation Description="选择手雷解锁鼠标（爆破模式）" EnableSwitch="Boomf" Point_X="0.049219" Point_Y="0.084722"/>
<SwitchOperation Description="打开设置" EnableSwitch="SetUp" DisableSwitch="InSetUp|ReturnSetUp" Point_X="0.769231" Point_Y="0.042831"/>
</KeyMapping>
<KeyMapping ItemName="%spaceName" Point_X="0.958008" Point_Y="0.675347" Description="Space" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%spaceCode">
<SwitchOperation Description="刹车（无人机）" EnableSwitch="Brake" DisableSwitch="ReturnSetUp" Point_X="0.046875" Point_Y="0.637500"/>
<SwitchOperation Description="刹车按住（无人机）" EnableSwitch="Brake2" DisableSwitch="ReturnSetUp" Point_X="0.046875" Point_Y="0.637500"/>
<SwitchOperation Description="跳跃" EnableSwitch="Jump" DisableSwitch="ReturnSetUp" HideTips="1" Point_X="0.958008" Point_Y="0.675347"/>
<SwitchOperation Description="跳跃" EnableSwitch="SetUp" DisableSwitch="InSetUp|ReturnSetUp|Knife2|Diamond1|Diamond2|Diamond3|Diamond4|HangUp" Point_X="0.958008" Point_Y="0.675347" HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="%eName" Point_X="0.874375" Point_Y="0.436667" Description="字母键划线" MiniVisiable="true" MiniDisable="false" AutoCancel="0" AsciiCode="%eCode">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.874375" Point_Y="0.436667"/>
</KeyMapping>
<KeyMapping ItemName="%qName" Point_X="0.785000" Point_Y="0.440000" Description="字母键" MiniVisiable="true" MiniDisable="false" AutoCancel="0" AsciiCode="%qCode">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.785000" Point_Y="0.440000"/>
</KeyMapping>
<KeyMapping ItemName="%rName" Point_X="0.961250" Point_Y="0.434444" Description="字母键" MiniVisiable="true" MiniDisable="false" AutoCancel="0" AsciiCode="%rCode">
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.961250" Point_Y="0.434444"/>
</KeyMapping>
<KeyMapping ItemName="%mName" Point_X="0.958437" Point_Y="0.061453" Description="打开地图" Remark="" MiniVisiable="false" MiniDisable="false" AsciiCode="%mCode">
<SwitchOperation Description="打开地图" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf" Point_X="0.972705" Point_Y="0.124767"/>
</KeyMapping>
<KeyMapping ItemName="%ctrlName" Point_X="0.951562" Point_Y="0.825000" Description="趴下" MiniVisiable="false" MiniDisable="false" AsciiCode="%ctrlCode">
<SwitchOperation Description="趴下" EnableSwitch="Fall" DisableSwitch="InSetUp|Diamond1|Diamond2|Diamond3|Diamond4|HangUp" Point_X="0.967057" Point_Y="0.940104" HideTips="1"/>
<SwitchOperation Description="取消趴下" EnableSwitch="CancelFall" DisableSwitch="InSetUp|Diamond1|Diamond2|Diamond3|Diamond4|HangUp" Point_X="0.967057" Point_Y="0.940104" HideTips="1"/>
<SwitchOperation Description="" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.950625" Point_Y="0.884444" HideTips="1"/>
</KeyMapping>
<KeyMappingEx ItemName="WASD" Point_X="0.190625" Point_Y="0.713889" Description="移动" Remark="" MiniVisiable="false" MiniDisable="false" HideTipsAlways="1" Type="CrossKey" UP_AsciiCode="87" DOWN_AsciiCode="83" LEFT_AsciiCode="65" RIGHT_AsciiCode="68" Offset="0.070258" ShiftOffset="0.100000" Speed="0.000000"/>
<KeyMappingEx ItemName="鼠标左键" Point_X="0.060937" Point_Y="0.519444" Description="开火" Remark="" MiniVisiable="false" MiniDisable="false" AutoActive="1" Type="LClick" LOCK_AsciiCode="%lockMouseCode">
<SwitchOperation Description="锁定（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.848437" Point_Y="0.709722"/>
<SwitchOperation Description="上飞" EnableSwitch="FlyUp" DisableSwitch="XBtn|MapOpenFlag|InSetUp|BreastPatting|ReturnSetUp|SkillX" Point_X="0.885156" Point_Y="0.541667" HideTips="1"/>
<SwitchOperation Description="弓箭" EnableSwitch="Bow" DisableSwitch="BreastPatting|ReturnSetUp|SelectFireMode" Point_X="0.854688" Point_Y="0.745833" HideTips="1"/>
<SwitchOperation Description="射击" EnableSwitch="SetUp" DisableSwitch="BreastPatting|ReturnSetUp|Boomf" Point_X="0.854688" Point_Y="0.745833" HideTips="1"/>
<SwitchOperation Description="射击" EnableSwitch="Reload" DisableSwitch="BreastPatting|ReturnSetUp|SelectFireMode|Boomf" Point_X="0.854688" Point_Y="0.745833" HideTips="1"/>
</KeyMappingEx>
<KeyMappingEx ItemName="Move with Mouse" Point_X="0.661719" Point_Y="0.369444" Description="视角" Remark="" MiniVisiable="false" MiniDisable="false" HideTipsAlways="1" AutoActive="1" Raw="1" Type="RClick" Offset="0.450000" LOCK_AsciiCode="%lockMouseCode" AsciiCode="%lockMouseCode" MouseResetTime="1000" Sensi_X="1.000000" Sensi_Y="1.000000">
<SwitchOperation Description="视角" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
<SwitchOperation Description="视角" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
<SwitchOperation Description="视角" EnableSwitch="SteeringWheel" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
</KeyMappingEx>
<KeyMappingEx ItemName="%iName" Point_X="0.832506" Point_Y="0.270019"  Description="信号" Remark="" MiniVisiable="false" MiniDisable="false" NoDelete="1" SpecialFunc="0" OpGuidClass="0" InUseDisableView="1" Type="KeyMove" Offset="0.490000" Click_X="0.867866" Click_Y="0.317505" Click_Offset="0.450000" AsciiCode="%iCode" Cancel_X="-0.911133" Cancel_Y="-0.277778" Click_Left="1" ReleaseNow="0" RadiusOffset="1.000000" RadiusRatio="0.062035" Version="2.0" SkillRangeA="1.000000" SkillRangeB="1.000000" Center_X="0.872829" Center_Y="0.270950" StopMoving="0" NeedPressed="1" ReleaseMode="-1" KeyMoveMode="0" UseMousePos="0" Center_XY_Disable="1" Speed="0.000000" Sensi_X="1.000000" Sensi_Y="1.000000" IsObserve="0" UseDefaultCancelKey="1" Delay="0">
<SwitchOperation Description="信号" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMappingEx ItemName="%zName" Point_X="0.771712" Point_Y="0.172253" Description="开启/关闭广播" Remark="" MiniVisiable="false" MiniDisable="false" Type="MultiPoint" AsciiCode="%zCode">
<Point Point_X="0.614062" Point_Y="0.130556" Delay="300" IsMutex="1" MutexVal="1" IsRepeat="0" RepeatType="0" RepeatCount="0"/>
<Point Point_X="0.677344" Point_Y="0.130556" Delay="300" IsMutex="1" MutexVal="0" IsRepeat="0" RepeatType="0" RepeatCount="0"/>
<SwitchOperation Description="开启/静音广播" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMappingEx ItemName="%tName" Point_X="0.770471" Point_Y="0.109870" Description="开启/关闭语音" Remark="" MiniVisiable="false" MiniDisable="false" Type="MultiPoint" AsciiCode="%tCode">
<Point Point_X="0.580469" Point_Y="0.233333" Delay="300" IsMutex="1" MutexVal="1" IsRepeat="0" RepeatType="0" RepeatCount="0"/>
<Point Point_X="0.715625" Point_Y="0.233333" Delay="300" IsMutex="1" MutexVal="0" IsRepeat="0" RepeatType="0" RepeatCount="0"/>
<SwitchOperation Description="开启/关闭语音" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Voice|Boomf|Transformation"/>
</KeyMappingEx>
"""

const val KEYMAP_CONTENT_145_145 = """
<KeyMapSolution SolutionName="Multi Player">
  <KeyMapping Description="右键开镜" ShowOnLockAsciiCode="192" ItemName="右键" Point_X="0.874219" AsciiCode="-2" Point_Y="0.541667">
    <SwitchOperation Description="导弹齐射" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" EnableSwitch="MissileVolley" Point_X="0.944531" Point_Y="0.506944" HideTips="0" />
    <SwitchOperation Point_Y="0.787500" EnableSwitch="FlyDown" Description="下飞" Point_X="0.885938" HideTips="1" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|" />
    <SwitchOperation Point_X="0.874219" Point_Y="0.541667" DisableSwitch="ReturnSetUp" HideTips="1" Description="影刃" EnableSwitch="ShadowBlade" />
    <SwitchOperation HideTips="1" EnableSwitch="Sniper" DisableSwitch="ReturnSetUp|Boomf" Description="瞄准" Point_X="0.874219" Point_Y="0.541667" />
    <SwitchOperation HideTips="1" Description="取消瞄准" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.874219" Point_Y="0.541667" EnableSwitch="Sniper2" />
    <SwitchOperation DisableSwitch="ReturnSetUp" Point_Y="0.519444" HideTips="1" Point_X="0.060937" Description="刀" EnableSwitch="Knife" />
  </KeyMapping>
  <KeyMapping Point_Y="0.084722" Point_X="0.049219" Description="背包" AsciiCode="9" ItemName="Tab">
    <SwitchOperation EnableSwitch="Bow|Sniper2" Description="取消释放弓箭/盾牌" DisableSwitch="ReturnSetUp|Boomf" Point_Y="0.519444" Point_X="0.060937" />
    <SwitchOperation EnableSwitch="Shield1|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444" Description="盾牌" />
    <SwitchOperation Point_X="0.060937" Description="暴风雨" Point_Y="0.519444" DisableSwitch="ReturnSetUp|Boomf" EnableSwitch="Rainstorm|Sniper2" />
    <SwitchOperation Description="歼灭者" EnableSwitch="Annihilator|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444" />
    <SwitchOperation EnableSwitch="SetUp" Description="战绩面板" Point_X="0.049219" Point_Y="0.084722" DisableSwitch="ReturnSetUp|MissileVolley|Boomf" />
  </KeyMapping>
  <KeyMapping Point_X="0.769531" ItemName="=" Point_Y="0.315278" Description="加速跑" AsciiCode="187">
    <SwitchOperation TexturePosition="Run" Description="加速跑" EnableSwitch="Run" DisableSwitch="ReturnSetUp|Boomf" />
    <SwitchOperation EnableSwitch="Nightvision" Description="夜视仪开" DisableSwitch="ReturnSetUp" TexturePosition="Nightvision" />
    <SwitchOperation TexturePosition="Nightvision1" EnableSwitch="Nightvision1" Description="夜视仪关" DisableSwitch="ReturnSetUp" />
  </KeyMapping>
  <KeyMapping AsciiCode="27" Point_X="0.765625" Description="打开设置" Point_Y="0.050000" ItemName="Esc">
    <SwitchOperation Description="关闭躲猫猫介绍" Point_X="0.916406" Point_Y="0.209722" EnableSwitch="Cartoon" />
    <SwitchOperation Point_Y="0.052083" Description="返回设置" EnableSwitch="ReturnSetUp" Point_X="0.033203" />
    <SwitchOperation Point_X="0.775000" TexturePosition="InSetUp" EnableSwitch="InSetUp" Description="关闭设置" Point_Y="0.504167" />
    <SwitchOperation Description="选择手雷解锁鼠标（爆破模式）" EnableSwitch="Boomf" Point_Y="0.084722" Point_X="0.049219" />
    <SwitchOperation Description="打开设置" Point_X="0.765625" EnableSwitch="SetUp" DisableSwitch="InSetUp|ReturnSetUp" Point_Y="0.050000" />
  </KeyMapping>
  <KeyMapping Point_X="0.958008" AsciiCode="32" Description="跳跃" ItemName="空格" Point_Y="0.675347">
    <SwitchOperation Point_Y="0.637500" Point_X="0.046875" EnableSwitch="Brake" DisableSwitch="ReturnSetUp" HideTips="0" Description="刹车（无人机）" />
    <SwitchOperation DisableSwitch="ReturnSetUp" HideTips="0" Description="刹车按住（无人机）" EnableSwitch="Brake2" Point_X="0.046875" Point_Y="0.637500" />
    <SwitchOperation DisableSwitch="ReturnSetUp" Description="跳跃" EnableSwitch="Jump" HideTips="1" />
  </KeyMapping>
  <KeyMapping ItemName="1" AsciiCode="49" Point_X="0.494531" Point_Y="0.876389" Description="换1号武器">
    <SwitchOperation EnableSwitch="Jump" Point_X="0.494531" Point_Y="0.876389" Description="换1号武器" DisableSwitch="Boomf" />
    <SwitchOperation Point_Y="0.876389" EnableSwitch="Reload" DisableSwitch="Boomf" Description="换1号武器" Point_X="0.494531" />
  </KeyMapping>
  <KeyMapping ItemName="2" Point_X="0.618750" Description="换2号武器" AsciiCode="50" Point_Y="0.883333">
    <SwitchOperation DisableSwitch="Boomf" Description="换2号武器" Point_Y="0.883333" Point_X="0.618750" EnableSwitch="Jump" />
    <SwitchOperation Point_X="0.618750" Point_Y="0.883333" Description="换2号武器" EnableSwitch="Reload" DisableSwitch="Boomf" />
  </KeyMapping>
  <KeyMapping Point_Y="0.880556" ItemName="3" Point_X="0.406250" Description="空对地导弹" AsciiCode="51">
    <SwitchOperation Point_Y="0.880556" EnableSwitch="Jump" Description="扫描" DisableSwitch="Boomf" Point_X="0.406250" />
    <SwitchOperation DisableSwitch="SwitchMode4|Boomf" Point_X="0.406250" Point_Y="0.880556" Description="扫描" EnableSwitch="Reload" />
  </KeyMapping>
  <KeyMapping AsciiCode="52" Description="飞机雷" Point_Y="0.884722" ItemName="4" Point_X="0.350781">
    <SwitchOperation Point_Y="0.884722" EnableSwitch="Jump" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.350781" Description="飞机雷" />
    <SwitchOperation Description="飞机雷" EnableSwitch="Reload" Point_Y="0.884722" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.350781" />
  </KeyMapping>
  <KeyMapping Description="扫描" AsciiCode="53" ItemName="5" Point_Y="0.893056" Point_X="0.290625">
    <SwitchOperation EnableSwitch="Jump" Point_X="0.290625" Point_Y="0.893056" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Description="空对地导弹" />
    <SwitchOperation Point_X="0.290625" EnableSwitch="Reload" Point_Y="0.893056" Description="空对地导弹" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" />
  </KeyMapping>
  <KeyMapping AsciiCode="54" ItemName="6" Point_X="0.349609" Description="扫描" Point_Y="0.824653">
    <SwitchOperation Description="小空投" Point_X="0.349609" Point_Y="0.824653" EnableSwitch="Airdrop2" DisableSwitch="ReturnSetUp|Boomf" />
  </KeyMapping>
  <KeyMapping ItemName="C" Point_X="0.852539" AsciiCode="67" Description="下蹲" Point_Y="0.918403">
    <SwitchOperation EnableSwitch="Squat" Point_X="0.852539" Point_Y="0.918403" HideTips="1" DisableSwitch="Boomf" Description="下蹲" />
    <SwitchOperation EnableSwitch="CancelSquat" Point_X="0.852539" Point_Y="0.918403" HideTips="1" Description="取消下蹲" DisableSwitch="Boomf" />
    <SwitchOperation Point_X="0.852539" Point_Y="0.918403" DisableSwitch="Boomf" EnableSwitch="CancelFall" Description="取消趴下" HideTips="1" />
    <SwitchOperation EnableSwitch="Roll" Description="翻滚" DisableSwitch="Boomf" Point_Y="0.918403" HideTips="1" Point_X="0.852539" />
  </KeyMapping>
  <KeyMapping Point_X="0.947761" Point_Y="0.847513" ItemName="Z" Description="趴下" AsciiCode="90">
    <SwitchOperation Description="趴下" HideTips="1" EnableSwitch="Fall" DisableSwitch="InSetUp" Point_X="0.947761" Point_Y="0.847513" />
    <SwitchOperation EnableSwitch="CancelFall" HideTips="1" Description="取消趴下" DisableSwitch="InSetUp" Point_X="0.947761" Point_Y="0.847513" />
  </KeyMapping>
  <KeyMapping Point_Y="0.694444" AsciiCode="69" ItemName="E" Description="拆弹" Point_X="0.458594">
    <SwitchOperation Description="直升机炮手" Point_Y="0.552222" Point_X="0.738750" DisableSwitch="ReturnSetUp|Boomf" EnableSwitch="gunner" />
    <SwitchOperation Description="感应弹" DisableSwitch="ReturnSetUp|Boomf" Point_Y="0.677778" EnableSwitch="Induction" HideTips="0" Point_X="0.800781" />
    <SwitchOperation EnableSwitch="BombDisposal" DisableSwitch="Boomf" Point_X="0.458594" Point_Y="0.694444" Description="拆弹" />
    <SwitchOperation DisableSwitch="ReturnSetUp|Boomf" Description="技能" EnableSwitch="SetUp" Point_X="0.942187" Point_Y="0.347222" />
    <SwitchOperation DisableSwitch="Boomf" Description="安装炸弹" Point_X="0.458594" Point_Y="0.694444" EnableSwitch="Bomb1" />
  </KeyMapping>
  <KeyMapping OpGuidClass="0" Point_Y="0.386111" SpecialFunc="1002" Point_X="0.175000" ItemName="F" AsciiCode="70" NoDelete="1" Description="取消丢雷">
    <SwitchOperation Point_X="0.503906" Description="盾牌炮塔" Point_Y="0.702778" EnableSwitch="Hand2|YellowTriangle" DisableSwitch="ReturnSetUp|Boomf" />
    <SwitchOperation Description="换形（躲猫猫）" Point_X="0.729688" Point_Y="0.830556" DisableSwitch="ReturnSetUp|Boomf" EnableSwitch="Flash2" />
    <SwitchOperation DisableSwitch="ReturnSetUp|Boomf" Description="空投（一击必杀）" Point_X="0.503145" Point_Y="0.696078" EnableSwitch="Airdrop3" />
    <SwitchOperation Point_Y="0.731944" Description="切换位置" EnableSwitch="SwitchingPosition" TexturePosition="SwitchingPosition" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.043750" />
    <SwitchOperation Description="扔回丢雷" Point_X="0.744531" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_Y="0.611111" TexturePosition="BackGrenade" EnableSwitch="BackGrenade" />
    <SwitchOperation DisableSwitch="XBtn|MapOpenFlag|InSetUp" TexturePosition="CancelFireTheHole" EnableSwitch="CancelFireTheHole" Description="取消丢雷" Point_X="0.175000" Point_Y="0.386111" />
    <SwitchOperation Point_Y="0.776389" Description="换武器" Point_X="0.508594" EnableSwitch="SwitchWeapon" DisableSwitch="ReturnSetUp|Boomf" />
    <SwitchOperation EnableSwitch="XS1Goliath" Point_X="0.522656" DisableSwitch="ReturnSetUp|Boomf" Point_Y="0.694444" Description="无畏战士" />
    <SwitchOperation Point_Y="0.698611" DisableSwitch="ReturnSetUp|Boomf" Description="取消" EnableSwitch="YellowTriangle" Point_X="0.597656" TexturePosition="YellowTriangle" />
    <SwitchOperation EnableSwitch="TrophySystem|OpenFunction" Description="拾取防爆装置" DisableSwitch="InSetUp|ReturnSetUp|Knife2" Point_X="0.516406" TexturePosition="TrophySystem" Point_Y="0.695833" />
    <SwitchOperation Description="打开空投" EnableSwitch="Airdrop" Point_Y="0.695833" Point_X="0.503906" DisableSwitch="ReturnSetUp|Knife2|Boomf" />
    <SwitchOperation EnableSwitch="Turret|Turret1" Description="盾牌炮塔拿起" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.792188" Point_Y="0.591667" />
    <SwitchOperation EnableSwitch="GetOutCar" HideTips="1" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.943750" Point_Y="0.376389" Description="下车" />
    <SwitchOperation Description="换背包" EnableSwitch="SwitchBackpage" Point_X="0.508594" Point_Y="0.776389" DisableSwitch="ReturnSetUp|Boomf" TexturePosition="SwitchBackpage" />
    <SwitchOperation DisableSwitch="ReturnSetUp|Boomf" EnableSwitch="OpenFunction" Description="开启功能" TexturePosition="OpenFunction" />
    <SwitchOperation TexturePosition="Missile" DisableSwitch="ReturnSetUp|Boomf" EnableSwitch="Missile" Description="使用核弹" Point_Y="0.591667" Point_X="0.792188" />
  </KeyMapping>
  <KeyMapping Point_Y="0.893056" AsciiCode="71" Description="手雷" ItemName="G" Point_X="0.700000">
    <SwitchOperation Point_X="0.765766" Point_Y="0.616000" DisableSwitch="ReturnSetUp|Boomf|" TexturePosition="Turret" Description="盾牌炮塔" EnableSwitch="Turret" />
    <SwitchOperation Description="盾牌炮塔" Point_Y="0.616000" EnableSwitch="Turret1" Point_X="0.765766" TexturePosition="Turret1" DisableSwitch="ReturnSetUp|Boomf" />
    <SwitchOperation Description="手雷" EnableSwitch="Jump" Point_X="0.700000" DisableSwitch="ReturnSetUp|Cartoon|Boomf" Point_Y="0.893056" />
    <SwitchOperation EnableSwitch="Reload" Point_X="0.700000" Description="手雷" DisableSwitch="ReturnSetUp|Boomf" Point_Y="0.893056" />
  </KeyMapping>
  <KeyMapping Description="打开地图" Point_Y="0.062500" AsciiCode="77" ItemName="M" Point_X="0.970313">
    <SwitchOperation EnableSwitch="SetUp" Point_Y="0.079167" Description="打开地图" Point_X="0.967969" DisableSwitch="ReturnSetUp|MissileVolley|Boomf" />
  </KeyMapping>
  <KeyMapping HideTipsAlways="0" ItemName="Q" Point_X="0.680469" Point_Y="0.822222" AsciiCode="81" Description="切换手雷">
    <SwitchOperation Point_X="0.824686" Description="闪光弹（躲猫猫）" DisableSwitch="ReturnSetUp" Point_Y="0.914566" EnableSwitch="Flash2" />
    <SwitchOperation Point_Y="0.822222" EnableSwitch="SetUp" Description="切换手雷" DisableSwitch="ReturnSetUp" Point_X="0.680469" />
  </KeyMapping>
  <KeyMapping ItemName="R" Description="换弹" AsciiCode="82" Point_X="0.756836" Point_Y="0.824653">
    <SwitchOperation EnableSwitch="Flash2" Description="假身（躲猫猫）" Point_X="0.734375" DisableSwitch="ReturnSetUp|Boomf" Point_Y="0.661111" />
    <SwitchOperation DisableSwitch="ReturnSetUp|Boomf" EnableSwitch="Reload" TexturePosition="Reload" Description="换弹" />
  </KeyMapping>
  <KeyMapping Point_X="0.758594" Point_Y="0.644444" ItemName="V" Description="快速挥刀" AsciiCode="86">
    <SwitchOperation Point_Y="0.644444" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" EnableSwitch="Knife|Reload" Description="快速挥刀" />
    <SwitchOperation Description="快速挥刀" Point_Y="0.644444" EnableSwitch="Knife|Sniper" Point_X="0.758594" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" />
    <SwitchOperation Description="快速挥刀" EnableSwitch="Knife|Sniper2" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444" />
    <SwitchOperation Description="快速挥刀" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" EnableSwitch="Knife|SwitchMode3" Point_Y="0.644444" />
    <SwitchOperation TexturePosition="Stair" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Description="爬楼梯（团队模式）" EnableSwitch="Stair" Point_X="0.794382" Point_Y="0.587000" />
  </KeyMapping>
  <KeyMapping Description="表情" Point_Y="0.045833" AsciiCode="115" ItemName="F4" Point_X="0.722656">
    <SwitchOperation TexturePosition="Emoji" Description="表情" DisableSwitch="ReturnSetUp||Boomf" EnableSwitch="Emoji" />
    <SwitchOperation DisableSwitch="ReturnSetUp|Boomf" TexturePosition="BreastPatting" Description="表情" EnableSwitch="BreastPatting" />
  </KeyMapping>
  <KeyMappingEx Point_Y="0.713889" Type="CrossKey" Point_X="0.190625" LEFT_AsciiCode="65" UP_AsciiCode="87" ShiftOffset="0.100000" RIGHT_AsciiCode="68" Offset="0.070258" Description="移动" ItemName="WASD" DOWN_AsciiCode="83" HideTipsAlways="1" />
  <KeyMappingEx Point_X="0.060937" ItemName="鼠标左键" Type="LClick" Point_Y="0.519444" Description="开火" AutoActive="1" LOCK_AsciiCode="192">
    <SwitchOperation DisableSwitch="ReturnSetUp|Boomf" Point_Y="0.709722" HideTips="0" Description="锁定（躲猫猫）" EnableSwitch="Flash2" Point_X="0.848437" />
    <SwitchOperation DisableSwitch="XBtn|MapOpenFlag|InSetUp|BreastPatting|ReturnSetUp|SkillX" EnableSwitch="FlyUp" Description="上飞" Point_X="0.885156" Point_Y="0.541667" HideTips="1" />
    <SwitchOperation EnableSwitch="Bow" Point_X="0.854688" Description="弓箭" Point_Y="0.745833" HideTips="1" DisableSwitch="BreastPatting|ReturnSetUp|SelectFireMode" />
    <SwitchOperation EnableSwitch="SetUp" DisableSwitch="BreastPatting|ReturnSetUp|Boomf" Point_Y="0.745833" HideTips="1" Point_X="0.854688" Description="射击" />
    <SwitchOperation EnableSwitch="Reload" Point_X="0.854688" Point_Y="0.745833" DisableSwitch="BreastPatting|ReturnSetUp|SelectFireMode|Boomf" HideTips="1" Description="射击" />
  </KeyMappingEx>
  <KeyMappingEx Raw="1" Point_X="0.661719" Point_Y="0.369444" Type="RClick" ItemName="" HideTipsAlways="1" LOCK_AsciiCode2="17" AsciiCode="17" Offset="0.450000" LOCK_AsciiCode="192" Description="视角" AutoActive="1">
    <SwitchOperation EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1" Description="视角" />
    <SwitchOperation DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1" Description="视角" EnableSwitch="Reload" />
    <SwitchOperation Description="视角" EnableSwitch="SteeringWheel" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1" />
  </KeyMappingEx>
  <KeyMappingEx Description="滚轮切枪" Point_Y="0.883333" HideTipsAlways="1" ItemName="滚轮切枪" Point_X="0.618750" Type="WheelClick" Click_Y="0.876389" Click_X="0.494531">
    <SwitchOperation EnableSwitch="Jump" DisableSwitch="ReturnSetUp" Description="跳跃" />
    <SwitchOperation DisableSwitch="ReturnSetUp" Description="换弹" EnableSwitch="Reload" />
  </KeyMappingEx>
  <KeyMappingEx Description="开启/关闭广播" Point_Y="0.138889" AsciiCode="84" Type="MultiPoint" ItemName="T" Point_X="0.767188">
    <Point IsMutex="1" IsRepeat="0" Point_X="0.614062" Point_Y="0.130556" Delay="300" MutexVal="1" />
    <Point Point_Y="0.130556" Delay="300" IsMutex="1" Point_X="0.677344" MutexVal="0" IsRepeat="0" />
    <SwitchOperation Description="开启/静音广播" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation" />
  </KeyMappingEx>
  <KeyMappingEx Point_X="0.767969" Description="开启/关闭语音" Point_Y="0.220833" Type="MultiPoint" AsciiCode="89" ItemName="Y">
    <Point Point_X="0.580469" Point_Y="0.233333" Delay="300" IsMutex="1" MutexVal="1" IsRepeat="0" />
    <Point IsMutex="1" MutexVal="0" Point_Y="0.233333" IsRepeat="0" Delay="300" Point_X="0.715625" />
    <SwitchOperation Description="开启/关闭语音" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Voice|Boomf|Transformation" />
  </KeyMappingEx>
  <KeyMapping Point_Y="0.220833" AsciiCode="89" Point_X="0.767969" ItemName="Y" Description="语音按住">
    <SwitchOperation EnableSwitch="Voice" Description="语音按住" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation" />
  </KeyMapping>
  <KeyMappingEx Type="MultiPoint" Point_Y="0.313889" Description="快速说话" Point_X="0.818750" InUseDisableView="1" ItemName="F2" AsciiCode="113">
    <Point Delay="300" Point_X="0.657031" IsRepeat="0" IsMutex="0" Point_Y="0.073611" MutexVal="0" />
    <SwitchOperation Description="快速说话(第一句)" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation" EnableSwitch="SetUp" />
  </KeyMappingEx>
  <KeyMappingEx AsciiCode="114" Type="MultiPoint" Point_Y="0.313889" ItemName="F3" HideTipsAlways="1" InUseDisableView="1" Description="快速说话" Point_X="0.818750">
    <Point IsMutex="0" MutexVal="0" IsRepeat="0" Point_X="0.657813" Delay="300" Point_Y="0.148611" />
    <SwitchOperation Description="快速说话(第二句)" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley" />
  </KeyMappingEx>
  <KeyMappingEx NeedPressed="1" Click_Left="1" SpecialFunc="0" Click_Y="0.318056" Center_Y="0.000000" Point_X="0.867969" Type="KeyMove" AsciiCode="88" OpGuidClass="0" ReleaseNow="0" Center_XY_Disable="1" Click_X="0.867969" Description="信号" StopMoving="0" Point_Y="0.318056" Cancel_X="-0.911133" Cancel_Y="-0.277778" Offset="0.49" InUseDisableView="1" NoDelete="1" ItemName="X" Center_X="0.000000" Click_Offset="0.450000">
    <SwitchOperation Description="信号" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation" />
  </KeyMappingEx>
  <KeyMapping Point_Y="0.681111" AsciiCode="66" Description="引爆" Point_X="0.672500" ItemName="B">
    <SwitchOperation Point_X="0.672500" Point_Y="0.681111" Description="引爆c4" EnableSwitch="bomb" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" />
  </KeyMapping>
</KeyMapSolution>
"""

const val KEYMAP_CONTENT_145 = """
{
    "lastSolutionId": "1752061764155",
    "lastSolutionIdType": {
        "id": "1752061764155",
        "type": 0
    },
    "modeId": 145,
    "solutions": {
        "1752061764155": {
            "inputType": 1,
            "solutionId": "1752061764155",
            "solutionName": "Multi Player",
            "sourceDesc": {
                "last_badge_version_id": "15634",
                "solutionId": "145",
                "sourceType": 1,
                "versionId": "15634"
            }
        }
    }
}
"""
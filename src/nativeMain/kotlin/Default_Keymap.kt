const val DEFAULT_KEYMAP = """
<Item ApkName="com.activision.callofduty.shooter" 备注="使命召唤手游" VersionCode="1">
<LastMode ModeID="1" EnableTips="0" TipsTransparent="0.500000" Lightness="1.000000" ExitFullScreenKey="122" EnableGameKeyDT="1"/>
<VersionInfo Version="4" ReqFeatureVer="7"/>
<Switch Name="DoorOpen" TextureId="1"  	comm="开关门"/>
<Switch Name="GetIntoCar" TextureId="2"	comm="上车驾驶"/>
<Switch Name="GetOutCar" TextureId="3"	comm="下车"/>
<Switch Name="ByCar" TextureId="6"	comm="乘车"/>
<Switch Name="Whistle" TextureId="7"	comm="鸣笛"/>
<Switch Name="ClickPickupDown" TextureId="8"	comm="点开捡物"/>
<Switch Name="XS1Goliath" TextureId="9"	comm="无畏战士（团队模式）"/>
<Switch Name="HelpMe" TextureId="10"	comm="求助"/>
<Switch Name="Parachute4" TextureId="11"   comm="跳伞（四人）"/>
<Switch Name="Parachute1" TextureId="12"   comm="跳伞（单人）"/>
<Switch Name="Parachute2" TextureId="13"	comm="开伞"/>
<Switch Name="Run" TextureId="14"	comm="疾跑"/>
<Switch Name="MapOpenFlag" TextureId="16"	comm="地图打开标志"/>
<Switch Name="Eye" TextureId="17"	comm="眼睛"  />
<Switch Name="OpenEye" TextureId="18"	comm="开眼睛"/>
<Switch Name="ClickPacket" TextureId="19"	comm="点开快递包"/>
<Switch Name="Backpage" TextureId="20"	comm="1级背包"  ModeID="2"/>
<Switch Name="FireMode1" TextureId="21"	comm="开火模式（左）" />
<Switch Name="Backpage3" TextureId="22"	comm="3级背包" ModeID="2" />
<Switch Name="Sniper" TextureId="23"		comm="瞄准"/>
<Switch Name="Squat" TextureId="24"	comm="蹲下"/>
<Switch Name="CancelSquat" TextureId="25"	comm="取消蹲下"/>
<Switch Name="Jump" TextureId="26"	comm="跳跃"/>
<Switch Name="InSetUp" TextureId="27"	comm="设置的M"/>
<Switch Name="Sniper2" TextureId="28"		comm="取消瞄准"/>
<Switch Name="Reload" TextureId="29"	comm="换弹药"/>
<Switch Name="SetUp" TextureId="30"	comm="设置" />
<Switch Name="Emoji" TextureId="31" comm="表情"/>
<Switch Name="Help" TextureId="32"	comm="救人"/>
<Switch Name="Brake" TextureId="33"	comm="刹车"/>
<Switch Name="Brake2" TextureId="34"	comm="刹车,按着"/>
<Switch Name="FlyUp" TextureId="35" 		comm="上飞"/>
<Switch Name="FlyDown" TextureId="36" 		comm="下飞"/>
<Switch Name="SwimUp" TextureId="37"	comm="上潜"/>
<Switch Name="SwimDown" TextureId="38"	comm="下潜"/>
<Switch Name="CancelFireTheHole" TextureId="40"	comm="取消丢雷"/>
<Switch Name="SwimmingUp" TextureId="41"	comm="上潜中"/>
<Switch Name="SwimmingDown" TextureId="42"	comm="下潜中"/>
<Switch Name="Whistling" TextureId="43"	comm="鸣笛中"/>
<Switch Name="ReturnSetUp" TextureId="44"	comm="返回游戏"/>
<Switch Name="SkillCircle" TextureId="46"	comm="选技能的方框" />
<Switch Name="SkillUpgrade" TextureId="47"	comm="升级技能"/>
<Switch Name="Cable" TextureId="48"	comm="缆绳"/>
<Switch Name="CancelCable" TextureId="49"	comm="取消缆绳"/>
<Switch Name="SkillX" TextureId="50"	comm="选技能的X"/>
<Switch Name="PickupDown" TextureId="51"	comm="白色向下箭头"/>
<Switch Name="XBtn" TextureId="52"	comm="药物的加号"/>
<Switch Name="PacketLeft" TextureId="53"	comm="白色向左箭头（快递）"/>
<Switch Name="CancelFall" TextureId="54"	comm="取消趴下"/>
<Switch Name="BreastPatting" TextureId="55"	comm="表情的X"/>
<Switch Name="Diamond1" TextureId="56"	comm="背包内向右箭头" ModeID="1"/>
<Switch Name="SwitchBackpage" TextureId="57"	comm="更换背包"/>
<Switch Name="SteeringWheel" TextureId="58"	comm="方向轮盘"/>
<Switch Name="Knife" TextureId="59"	comm="刀（团队模式）"/>
<Switch Name="SwitchWeapon" TextureId="60"	comm="更换武器）"/>
<Switch Name="SelectFireMode" TextureId="61"	comm="选择开火模式的左边框"/>
<Switch Name="BombDisposal" TextureId="62"	comm="拆弹）"/>
<Switch Name="BackGrenade" TextureId="63"	comm="扔回手雷"/>
<Switch Name="HangUp" TextureId="64"	comm="挂机后的边框"/>
<Switch Name="Bounce" TextureId="68"	comm="弹跳"/>
<Switch Name="Open" TextureId="69"  	comm="展开"/>
<Switch Name="Close" TextureId="70"  	comm="关上"/>
<Switch Name="Smoke" TextureId="71"  	comm="烟雾弹"/>
<Switch Name="Detonation" TextureId="72"  	comm="震爆弹"/>
<Switch Name="Gas" TextureId="73"  	comm="毒气弹"/>
<Switch Name="Grenade" TextureId="74"  	comm="手榴弹"/>
<Switch Name="FirstAidKit" TextureId="75"  	comm="急救包"/>
<Switch Name="HemostaticGel" TextureId="76"  	comm="止血凝胶"/>
<Switch Name="AnalgesicNeedle" TextureId="77"  	comm="止痛针"/>
<Switch Name="YellowM" TextureId="78"	comm="开局的黄色M"/>
<Switch Name="Hand" TextureId="79"	comm="模拟手" ModeID="1"/>
<Switch Name="Cluster" TextureId="80"  	comm="集束炸弹"/>
<Switch Name="SwitchGrenade" TextureId="81"  	comm="切换手雷"/>
<Switch Name="TrophySystem" TextureId="82"  	comm="拾取防爆装置"/>
<Switch Name="SerialFlash" TextureId="83"  	comm="连环闪光弹"/>
<Switch Name="Flash" TextureId="84"  	comm="闪光弹"/>
<Switch Name="Bow" TextureId="86"  	comm="弓箭"/>
<Switch Name="Throttle" TextureId="87"  	comm="油门"/>
<Switch Name="Airdrop" TextureId="88"  	comm="空投"/>
<Switch Name="Airdrop2" TextureId="89"  	comm="小空投"/>
<Switch Name="Missile" TextureId="90"  	comm="核弹"/>
<Switch Name="Induction" TextureId="91"  	comm="感应弹"/>
<Switch Name="SwitchingPosition" TextureId="92"  	comm="切换位置"/>
<Switch Name="MissileVolley" TextureId="93"  	comm="导弹齐射"/>
<Switch Name="WatchTeammates" TextureId="94"  	comm="观战队友"/>
<Switch Name="FireMode2" TextureId="95"	comm="开火模式" />
<Switch Name="Voice" TextureId="98"	comm="语音按住" />
<Switch Name="Gift" TextureId="111"	comm="礼物箱" />
<Switch Name="SwitchMode2" TextureId="112"	comm="团队模式头像标识" ModeID="1"/>
<Switch Name="SwitchMode3" TextureId="113"	comm="军火模式头像标识" ModeID="1"/>
<Switch Name="SwitchMode4" TextureId="114"	comm="躲猫猫头像标识" ModeID="1"/>
<Switch Name="Flash2" TextureId="115"	comm="闪光弹（躲猫猫）" />
<Switch Name="Airdrop3" TextureId="116"	comm="空投（一击必杀）" />
<Switch Name="Snow" TextureId="118"	comm="雪人手雷" />
<Switch Name="Cartoon" TextureId="119"	comm="介绍模式的漫画（躲猫猫）" />
<Switch Name="Moto1" TextureId="121"	comm="抬头" />
<Switch Name="Moto2" TextureId="122"	comm="抬头按住" />
<Switch Name="Knife2" TextureId="123"	comm="选武器的刀（单挑模式）" />
<Switch Name="Jamming" TextureId="124"	comm="飞机的干扰弹" />
<Switch Name="OpenFunction" TextureId="125"	comm="开启功能" />
<Switch Name="YellowTriangle" TextureId="126"	comm="黄色三角" />
<Switch Name="Fall" TextureId="127"	comm="趴下"/>
<Switch Name="CD" TextureId="128"	comm="CD"/>
<Switch Name="CDX" TextureId="129"	comm="CD的X"/>
<Switch Name="ShoppingMachine" TextureId="130"	comm="购物机向右标志"/>
<Switch Name="SwitchMode5" TextureId="131"	comm="训练场模式头像标识" ModeID="1"/>
<Switch Name="ShadowBlade" TextureId="132"	comm="影刃（团队模式）" />
<Switch Name="Tank1" TextureId="133"	comm="坦克1" />
<Switch Name="Tank2" TextureId="134"	comm="坦克2" />
<Switch Name="Roll" TextureId="135"	comm="翻滚（影刃）" />
<Switch Name="Tank3" TextureId="136"	comm="坦克夜视1" />
<Switch Name="Tank4" TextureId="137"	comm="坦克夜视2" />
<Switch Name="Airdrop4" TextureId="138"	comm="新空投" />
<Switch Name="Hand2" TextureId="139"	comm="模拟手（盾牌炮塔）" />
<Switch Name="Stair" TextureId="140" comm="爬楼梯（团队模式）"/>
<Switch Name="Turret" TextureId="141" comm="盾牌炮塔（团队模式）"/>
<Switch Name="Turret1" TextureId="142" comm="盾牌炮塔（离开）"/>
<Switch Name="Bulletproof" TextureId="143" comm="防弹插板"/>
<Switch Name="Boomf" TextureId="144" comm="选择手雷解锁鼠标（爆破模式）"/>
<Switch Name="Shield1" TextureId="145" comm="盾牌（团队模式）"/>
<Switch Name="Transformation" TextureId="146" comm="选择变什么物品（躲猫猫）"/>
<Switch Name="Telpher" TextureId="147" comm="缆车（恶魔岛）"/>
<Switch Name="Suicide" TextureId="148" comm="了断（恶魔岛）"/>
<Switch Name="Nightvision" TextureId="149" comm="夜视仪开"/>
<Switch Name="Nightvision1" TextureId="150" comm="夜视仪关"/>
<Switch Name="Rainstorm" TextureId="151" comm="暴风雨（团队模式）"/>
<Switch Name="Annihilator" TextureId="152" comm="歼灭者（团队模式）"/>
<Switch Name="Ski" TextureId="153" comm="滑雪板"/>
<Switch Name="Skijump" TextureId="154" comm="滑雪板跳"/>
<Switch Name="Armor" TextureId="155" comm="防弹衣"/>
<Switch Name="Biochemical" TextureId="156" comm="生化模式头像" ModeID="4"/>
<Switch Name="Biochemical2" TextureId="157" comm="生化模式解锁鼠标"/>
<Switch Name="Biochemical3" TextureId="158" comm="生化模式购买机解锁鼠标"/>
<Switch Name="Brpeekaboo" TextureId="159" comm="BR躲猫猫摄像头"/>
<Switch Name="Brpeekaboo1" TextureId="160" comm="BR躲猫猫退出"/>
<Switch Name="Spanner" TextureId="161" comm="异变围城扳手"/>
<Switch Name="Change" TextureId="162" comm="异变围城购买解锁"/>
<Switch Name="Carmor" TextureId="163" comm="普通护甲"/>
<Switch Name="Aarmor" TextureId="164" comm="高级护甲"/>
<Switch Name="Backpage2" TextureId="165" comm="2级背包"/>
<Switch Name="Helicopter" TextureId="166" comm="直升飞机的攻击"/>
<Switch Name="Tarmor" TextureId="167" comm="特级护甲"/>
<Switch Name="Blow" TextureId="168" comm="喷气芯片喷气"/>
<Switch Name="Blow1" TextureId="169" comm="喷气芯片喷气中"/>
<Switch Name="Grenadesn" TextureId="170" comm="新年手雷"/>
<Switch Name="jet" TextureId="171" comm="战斗机"/>
<Switch Name="Throttle2" TextureId="174" comm="油门2"/>
<Switch Name="AAgun" TextureId="172" comm="防空炮进"/>
<Switch Name="AAgun2" TextureId="173" comm="防空炮出"/>
<Switch Name="Mecha" TextureId="174" comm="进入机甲"/>
<Switch Name="Mecha1" TextureId="175" comm="离开机甲"/>
<Switch Name="Mecha2" TextureId="176" comm="取消离开"/>
<Switch Name="choose" TextureId="177" comm="义肢选择"/>
<Switch Name="choose1" TextureId="178" comm="义肢使用"/>
<Switch Name="tinybee" TextureId="179" comm="小蜜蜂"/>
<Switch Name="box" TextureId="180" comm="拳套"/>
<Switch Name="atv" TextureId="181" comm="塔奇克马载具机枪"/>
<Switch Name="atv1" TextureId="182" comm="塔奇克马载具"/>
<Switch Name="atv2" TextureId="183" comm="塔奇克马载具机枪下"/>
<Switch Name="bomb" TextureId="184" comm="引爆"/>
<Switch Name="gunner" TextureId="185" comm="直升机炮手"/>
<Switch Name="football" TextureId="186" comm="足球"/>
<Switch Name="Bomb1" TextureId="187" comm="安装炸弹"/>
<Switch Name="newmap1" TextureId="188" comm="新地图解锁1"/>
<Switch Name="newmap2" TextureId="189" comm="新地图解锁2"/>
<Switch Name="newmap3" TextureId="190" comm="新地图解锁3"/>
<Switch Name="Obsever" TextureId="191" comm="观战" ModeID="3"/>

<KeyMapMode ModeID="1" Name="团队竞技模式" CurrModeEnableTips="1">
<KeyMapping ItemName="右键" Point_X="0.874219" Point_Y="0.541667" Description="右键开镜" ShowOnLockAsciiCode="192" AsciiCode="-2">
<SwitchOperation Description="导弹齐射" EnableSwitch="MissileVolley" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.944531" Point_Y="0.506944" HideTips="0"/>
<SwitchOperation Description="下飞" EnableSwitch="FlyDown" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|" Point_X="0.885938" Point_Y="0.787500" HideTips="1"/>
<SwitchOperation Description="影刃" EnableSwitch="ShadowBlade" DisableSwitch="ReturnSetUp" Point_X="0.874219" Point_Y="0.541667" HideTips="1" />
<SwitchOperation Description="瞄准" EnableSwitch="Sniper" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.874219" Point_Y="0.541667" HideTips="1" />
<SwitchOperation Description="取消瞄准" EnableSwitch="Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.874219" Point_Y="0.541667" HideTips="1" />
<SwitchOperation Description="刀" EnableSwitch="Knife" DisableSwitch="ReturnSetUp" Point_X="0.060937" Point_Y="0.519444" HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="Tab" Point_X="0.049219" Point_Y="0.084722" Description="背包" AsciiCode="9">
<SwitchOperation Description="取消释放弓箭/盾牌" EnableSwitch="Bow|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444"  />
<SwitchOperation Description="盾牌" EnableSwitch="Shield1|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444"  />
<SwitchOperation Description="暴风雨" EnableSwitch="Rainstorm|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444"  />
<SwitchOperation Description="歼灭者" EnableSwitch="Annihilator|Sniper2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.060937" Point_Y="0.519444"  />
<SwitchOperation Description="战绩面板" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf" Point_X="0.049219" Point_Y="0.084722"/>
</KeyMapping>
<KeyMapping ItemName="=" Point_X="0.769531" Point_Y="0.315278" Description="加速跑" AsciiCode="187">
<SwitchOperation Description="加速跑" EnableSwitch="Run" DisableSwitch="ReturnSetUp|Boomf" TexturePosition="Run"/>
<SwitchOperation Description="夜视仪开" EnableSwitch="Nightvision" DisableSwitch="ReturnSetUp" TexturePosition="Nightvision"/>
<SwitchOperation Description="夜视仪关" EnableSwitch="Nightvision1" DisableSwitch="ReturnSetUp" TexturePosition="Nightvision1"/>
</KeyMapping>
<KeyMapping ItemName="Esc" Point_X="0.765625" Point_Y="0.050000" Description="打开设置" AsciiCode="27">
<SwitchOperation Description="关闭躲猫猫介绍" EnableSwitch="Cartoon" Point_X="0.916406" Point_Y="0.209722"/>
<SwitchOperation Description="返回设置" EnableSwitch="ReturnSetUp" Point_X="0.033203" Point_Y="0.052083"/>
<SwitchOperation Description="关闭设置" EnableSwitch="InSetUp" Point_X="0.775000" Point_Y="0.504167" TexturePosition="InSetUp"/>
<SwitchOperation Description="选择手雷解锁鼠标（爆破模式）" EnableSwitch="Boomf" Point_X="0.049219" Point_Y="0.084722"/>
<SwitchOperation Description="打开设置" EnableSwitch="SetUp" DisableSwitch="InSetUp|ReturnSetUp" Point_X="0.765625" Point_Y="0.050000"/>
</KeyMapping>
<KeyMapping ItemName="空格" Point_X="0.958008" Point_Y="0.675347" Description="跳跃" AsciiCode="32">
<SwitchOperation Description="刹车（无人机）" EnableSwitch="Brake" DisableSwitch="ReturnSetUp" Point_X="0.046875" Point_Y="0.637500" HideTips="0"/>
<SwitchOperation Description="刹车按住（无人机）" EnableSwitch="Brake2" DisableSwitch="ReturnSetUp" Point_X="0.046875" Point_Y="0.637500" HideTips="0"/>
<SwitchOperation Description="跳跃" EnableSwitch="Jump" DisableSwitch="ReturnSetUp"  HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="1" Point_X="0.494531" Point_Y="0.876389" Description="换1号武器" AsciiCode="49">
<SwitchOperation Description="换1号武器" EnableSwitch="Jump" DisableSwitch="Boomf" Point_X="0.494531" Point_Y="0.876389"/>
<SwitchOperation Description="换1号武器" EnableSwitch="Reload" DisableSwitch="Boomf" Point_X="0.494531" Point_Y="0.876389"/>
</KeyMapping>
<KeyMapping ItemName="2" Point_X="0.618750" Point_Y="0.883333" Description="换2号武器" AsciiCode="50">
<SwitchOperation Description="换2号武器" EnableSwitch="Jump" DisableSwitch="Boomf" Point_X="0.618750" Point_Y="0.883333"/>
<SwitchOperation Description="换2号武器" EnableSwitch="Reload" DisableSwitch="Boomf" Point_X="0.618750" Point_Y="0.883333"/>
</KeyMapping>
<KeyMapping ItemName="3" Point_X="0.406250" Point_Y="0.880556" Description="空对地导弹" AsciiCode="51">
<SwitchOperation Description="扫描" EnableSwitch="Jump" DisableSwitch="Boomf" Point_X="0.406250" Point_Y="0.880556"/>
<SwitchOperation Description="扫描" EnableSwitch="Reload" DisableSwitch="SwitchMode4|Boomf" Point_X="0.406250" Point_Y="0.880556"/>
</KeyMapping>
<KeyMapping ItemName="4" Point_X="0.350781" Point_Y="0.884722" Description="飞机雷" AsciiCode="52">
<SwitchOperation Description="飞机雷" EnableSwitch="Jump" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.350781" Point_Y="0.884722"/>
<SwitchOperation Description="飞机雷" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.350781" Point_Y="0.884722"/>
</KeyMapping>
<KeyMapping ItemName="5" Point_X="0.290625" Point_Y="0.893056" Description="扫描" AsciiCode="53">
<SwitchOperation Description="空对地导弹" EnableSwitch="Jump" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.290625" Point_Y="0.893056"/>
<SwitchOperation Description="空对地导弹" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|SwitchMode4|Boomf" Point_X="0.290625" Point_Y="0.893056"/>
</KeyMapping>
<KeyMapping ItemName="6" Point_X="0.349609" Point_Y="0.824653" Description="扫描" AsciiCode="54">
<SwitchOperation Description="小空投" EnableSwitch="Airdrop2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.349609" Point_Y="0.824653"/>
</KeyMapping>
<KeyMapping ItemName="C" Point_X="0.852539" Point_Y="0.918403" Description="下蹲" AsciiCode="67">
<SwitchOperation Description="下蹲" EnableSwitch="Squat" DisableSwitch="Boomf" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
<SwitchOperation Description="取消下蹲" EnableSwitch="CancelSquat" DisableSwitch="Boomf" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
<SwitchOperation Description="取消趴下" EnableSwitch="CancelFall" DisableSwitch="Boomf" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
<SwitchOperation Description="翻滚" EnableSwitch="Roll" DisableSwitch="Boomf" Point_X="0.852539" Point_Y="0.918403" HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="Z" Point_X="0.951562" Point_Y="0.825000" Description="趴下" AsciiCode="90">
<SwitchOperation Description="趴下" EnableSwitch="Fall" DisableSwitch="InSetUp"  HideTips="1"/>
<SwitchOperation Description="取消趴下" EnableSwitch="CancelFall" DisableSwitch="InSetUp"  HideTips="1"/>
</KeyMapping>
<KeyMapping ItemName="E" Point_X="0.458594" Point_Y="0.694444" Description="拆弹" AsciiCode="69">
<SwitchOperation Description="直升机炮手" EnableSwitch="gunner" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.738750" Point_Y="0.552222"/>
<SwitchOperation Description="感应弹" EnableSwitch="Induction" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.800781" Point_Y="0.677778" HideTips="0"/>
<SwitchOperation Description="拆弹" EnableSwitch="BombDisposal" DisableSwitch="Boomf" Point_X="0.458594" Point_Y="0.694444"/>
<SwitchOperation Description="技能" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.942187" Point_Y="0.347222"/>
<SwitchOperation Description="安装炸弹" EnableSwitch="Bomb1" DisableSwitch="Boomf" Point_X="0.458594" Point_Y="0.694444"/>
</KeyMapping>
<KeyMapping ItemName="F" Point_X="0.175000" Point_Y="0.386111" Description="取消丢雷" NoDelete="1" SpecialFunc="1002" OpGuidClass="0" AsciiCode="70">
<SwitchOperation Description="盾牌炮塔" EnableSwitch="Hand2|YellowTriangle" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.503906" Point_Y="0.702778"/>
<SwitchOperation Description="换形（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.729688" Point_Y="0.830556"/>
<SwitchOperation Description="空投（一击必杀）" EnableSwitch="Airdrop3" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.503145" Point_Y="0.696078" />
<SwitchOperation Description="切换位置" EnableSwitch="SwitchingPosition" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.043750" Point_Y="0.731944" TexturePosition="SwitchingPosition"/>
<SwitchOperation Description="扔回丢雷" EnableSwitch="BackGrenade" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.744531" Point_Y="0.611111" TexturePosition="BackGrenade"/>
<SwitchOperation Description="取消丢雷" EnableSwitch="CancelFireTheHole" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.175000" Point_Y="0.386111" TexturePosition="CancelFireTheHole"/>
<SwitchOperation Description="换武器" EnableSwitch="SwitchWeapon" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.508594" Point_Y="0.776389"/>
<SwitchOperation Description="无畏战士" EnableSwitch="XS1Goliath" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.522656" Point_Y="0.694444" />
<SwitchOperation Description="取消" EnableSwitch="YellowTriangle" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.597656" Point_Y="0.698611" TexturePosition="YellowTriangle"/>
<SwitchOperation Description="拾取防爆装置" EnableSwitch="TrophySystem|OpenFunction" DisableSwitch="InSetUp|ReturnSetUp|Knife2" Point_X="0.516406" Point_Y="0.695833" TexturePosition="TrophySystem"/>
<SwitchOperation Description="打开空投" EnableSwitch="Airdrop" DisableSwitch="ReturnSetUp|Knife2|Boomf" Point_X="0.503906" Point_Y="0.695833" />
<SwitchOperation Description="盾牌炮塔拿起" EnableSwitch="Turret|Turret1" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.792188" Point_Y="0.591667"/>
<SwitchOperation Description="下车" EnableSwitch="GetOutCar" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.943750" Point_Y="0.376389" HideTips="1"/>
<SwitchOperation Description="换背包" EnableSwitch="SwitchBackpage" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.508594" Point_Y="0.776389" TexturePosition="SwitchBackpage"/>
<SwitchOperation Description="开启功能" EnableSwitch="OpenFunction" DisableSwitch="ReturnSetUp|Boomf" TexturePosition="OpenFunction"/>
<SwitchOperation Description="使用核弹" EnableSwitch="Missile" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.792188" Point_Y="0.591667" TexturePosition="Missile"/>
</KeyMapping>
<KeyMapping ItemName="G" Point_X="0.700000" Point_Y="0.893056" Description="手雷" AsciiCode="71">
<SwitchOperation Description="盾牌炮塔" EnableSwitch="Turret" DisableSwitch="ReturnSetUp|Boomf|" Point_X="0.765766" Point_Y="0.616000" TexturePosition="Turret"/>
<SwitchOperation Description="盾牌炮塔" EnableSwitch="Turret1" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.765766" Point_Y="0.616000" TexturePosition="Turret1"/>
<SwitchOperation Description="手雷" EnableSwitch="Jump" DisableSwitch="ReturnSetUp|Cartoon|Boomf" Point_X="0.700000" Point_Y="0.893056"/>
<SwitchOperation Description="手雷" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.700000" Point_Y="0.893056"/>
</KeyMapping>
<KeyMapping ItemName="M" Point_X="0.970313" Point_Y="0.062500" Description="打开地图" AsciiCode="77">
<SwitchOperation Description="打开地图" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf" Point_X="0.967969" Point_Y="0.079167"/>
</KeyMapping>
<KeyMapping ItemName="Q" Point_X="0.680469" Point_Y="0.822222" Description="切换手雷" AsciiCode="81" HideTipsAlways="0">
<SwitchOperation Description="闪光弹（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp" Point_X="0.824686" Point_Y="0.914566" />
<SwitchOperation Description="切换手雷" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp" Point_X="0.680469" Point_Y="0.822222"/>
</KeyMapping>
<KeyMapping ItemName="R" Point_X="0.756836" Point_Y="0.824653" Description="换弹" AsciiCode="82">
<SwitchOperation Description="假身（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.734375" Point_Y="0.661111"/>
<SwitchOperation Description="换弹" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|Boomf" TexturePosition="Reload"/>
</KeyMapping>
<KeyMapping ItemName="V" Point_X="0.758594" Point_Y="0.644444" Description="快速挥刀" AsciiCode="86">
<SwitchOperation Description="快速挥刀" EnableSwitch="Knife|Reload" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444"/>
<SwitchOperation Description="快速挥刀" EnableSwitch="Knife|Sniper" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444"/>
<SwitchOperation Description="快速挥刀" EnableSwitch="Knife|Sniper2" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444"/>
<SwitchOperation Description="快速挥刀" EnableSwitch="Knife|SwitchMode3" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.758594" Point_Y="0.644444"/>
<SwitchOperation Description="爬楼梯（团队模式）" EnableSwitch="Stair" DisableSwitch="XBtn|MapOpenFlag|InSetUp" Point_X="0.794382" Point_Y="0.587000" TexturePosition="Stair"/>
</KeyMapping>
<KeyMapping ItemName="F4" Point_X="0.722656" Point_Y="0.045833" Description="表情" AsciiCode="115">
<SwitchOperation Description="表情" EnableSwitch="Emoji" DisableSwitch="ReturnSetUp||Boomf" TexturePosition="Emoji"/>
<SwitchOperation Description="表情" EnableSwitch="BreastPatting" DisableSwitch="ReturnSetUp|Boomf" TexturePosition="BreastPatting"/>
</KeyMapping>
<KeyMappingEx ItemName="WASD" Point_X="0.190625" Point_Y="0.713889" Description="移动" HideTipsAlways="1" Type="CrossKey" UP_AsciiCode="87" DOWN_AsciiCode="83" LEFT_AsciiCode="65" RIGHT_AsciiCode="68" Offset="0.070258" ShiftOffset="0.100000">
</KeyMappingEx>
<KeyMappingEx ItemName="鼠标左键" Point_X="0.060937" Point_Y="0.519444" Description="开火"  AutoActive="1" Type="LClick" LOCK_AsciiCode="192">
<SwitchOperation Description="锁定（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="ReturnSetUp|Boomf" Point_X="0.848437" Point_Y="0.709722" HideTips="0"/>
<SwitchOperation Description="上飞" EnableSwitch="FlyUp"  DisableSwitch="XBtn|MapOpenFlag|InSetUp|BreastPatting|ReturnSetUp|SkillX" Point_X="0.885156" Point_Y="0.541667" HideTips="1"/>
<SwitchOperation Description="弓箭" EnableSwitch="Bow" DisableSwitch="BreastPatting|ReturnSetUp|SelectFireMode" Point_X="0.854688" Point_Y="0.745833" HideTips="1"/>
<SwitchOperation Description="射击" EnableSwitch="SetUp" DisableSwitch="BreastPatting|ReturnSetUp|Boomf" Point_X="0.854688" Point_Y="0.745833" HideTips="1"/>
<SwitchOperation Description="射击" EnableSwitch="Reload" DisableSwitch="BreastPatting|ReturnSetUp|SelectFireMode|Boomf" Point_X="0.854688" Point_Y="0.745833" HideTips="1"/>
</KeyMappingEx>
<KeyMappingEx ItemName="" Point_X="0.661719" Point_Y="0.369444" Description="视角" HideTipsAlways="1" AutoActive="1" Raw="1" Type="RClick" Offset="0.450000" LOCK_AsciiCode="192" LOCK_AsciiCode2="17" AsciiCode="17">
<SwitchOperation Description="视角" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
<SwitchOperation Description="视角" EnableSwitch="Reload" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
<SwitchOperation Description="视角" EnableSwitch="SteeringWheel" DisableSwitch="ReturnSetUp|BreastPatting|SelectFireMode|HangUp|YellowM|Hand|Boomf|Transformation|InSetUp|Diamond1"/>
</KeyMappingEx>
<KeyMappingEx ItemName="滚轮切枪" Point_X="0.618750" Point_Y="0.883333" Description="滚轮切枪" HideTipsAlways="1" Type="WheelClick" Click_X="0.494531" Click_Y="0.876389">
<SwitchOperation Description="跳跃" EnableSwitch="Jump" DisableSwitch="ReturnSetUp"/>
<SwitchOperation Description="换弹" EnableSwitch="Reload" DisableSwitch="ReturnSetUp"/>
</KeyMappingEx>
<KeyMappingEx ItemName="T" Point_X="0.767188" Point_Y="0.138889" Description="开启/关闭广播" Type="MultiPoint" AsciiCode="84">
<Point Point_X="0.614062" Point_Y="0.130556" Delay="300" IsMutex="1" MutexVal="1" IsRepeat="0"/>
<Point Point_X="0.677344" Point_Y="0.130556" Delay="300" IsMutex="1" MutexVal="0" IsRepeat="0"/>
<SwitchOperation Description="开启/静音广播" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMappingEx ItemName="Y" Point_X="0.767969" Point_Y="0.220833" Description="开启/关闭语音" Type="MultiPoint" AsciiCode="89">
<Point Point_X="0.580469" Point_Y="0.233333" Delay="300" IsMutex="1" MutexVal="1" IsRepeat="0"/>
<Point Point_X="0.715625" Point_Y="0.233333" Delay="300" IsMutex="1" MutexVal="0" IsRepeat="0"/>
<SwitchOperation Description="开启/关闭语音" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Voice|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMapping ItemName="Y" Point_X="0.767969" Point_Y="0.220833" Description="语音按住"  AsciiCode="89">
<SwitchOperation Description="语音按住" EnableSwitch="Voice" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMapping>
<KeyMappingEx ItemName="F2" Point_X="0.818750" Point_Y="0.313889" Description="快速说话" InUseDisableView="1" Type="MultiPoint" AsciiCode="113">
<Point Point_X="0.657031" Point_Y="0.073611" Delay="300" IsMutex="0" MutexVal="0" IsRepeat="0"/>
<SwitchOperation Description="快速说话(第一句)" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMappingEx ItemName="F3" Point_X="0.818750" Point_Y="0.313889" Description="快速说话" HideTipsAlways="1" InUseDisableView="1" Type="MultiPoint" AsciiCode="114">
<Point Point_X="0.657813" Point_Y="0.148611" Delay="300" IsMutex="0" MutexVal="0" IsRepeat="0"/>
<SwitchOperation Description="快速说话(第二句)" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley"/>
</KeyMappingEx>
<KeyMappingEx ItemName="X" Point_X="0.867969" Point_Y="0.318056" Description="信号" InUseDisableView="1" NoDelete="1" SpecialFunc="0" OpGuidClass="0" Type="KeyMove" Offset="0.49"  AsciiCode="88" Cancel_X="-0.911133" Cancel_Y="-0.277778" Click_X="0.867969" Click_Y="0.318056" Click_Offset="0.450000" Click_Left="1" ReleaseNow="0" Center_X="0.000000" Center_Y="0.000000" StopMoving="0" NeedPressed="1" Center_XY_Disable="1">
<SwitchOperation Description="信号" EnableSwitch="SetUp" DisableSwitch="ReturnSetUp|MissileVolley|Boomf|Transformation"/>
</KeyMappingEx>
<KeyMapping ItemName="B" Point_X="0.672500" Point_Y="0.681111" Description="引爆" AsciiCode="66">
<SwitchOperation Description="引爆c4" EnableSwitch="bomb" DisableSwitch="InSetUp|ReturnSetUp|Roll|ShadowBlade" Point_X="0.672500" Point_Y="0.681111"/>
</KeyMapping>
</KeyMapMode>

<KeyMapMode ModeID="2" Name="使命战场模式"  CurrModeEnableTips="1">
    <KeyMappingEx ItemName="F2" Point_X="0.818750" Point_Y="0.313889" Description="快速说话" AsciiCode="113" Type="MultiPoint" HideTipsAlways="0" InUseDisableView="1">
	<Point Point_X="0.650781" Point_Y="0.147222" Delay="300" IsMutex="0" MutexVal="0" IsRepeat="0"/>
	<SwitchOperation Description="快速说话(第一句)" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp|CDX"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="F3" Point_X="0.818750" Point_Y="0.313889" Description="快速说话" AsciiCode="114" Type="MultiPoint" HideTipsAlways="1" InUseDisableView="1">
	<Point Point_X="0.651563" Point_Y="0.359722" Delay="300" IsMutex="0" MutexVal="0" IsRepeat="0"/>
	<SwitchOperation Description="快速说话(第二句)" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp|CDX"/>
	</KeyMappingEx>
	<KeyMapping ItemName="=" Point_X="0.769531" Point_Y="0.304167" Description="加速跑" AsciiCode="187" >
	 <SwitchOperation Description="加速跑" EnableSwitch="Run" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp|CDX" TexturePosition="Run"/>
	 <SwitchOperation Description="夜视仪开" EnableSwitch="Nightvision" DisableSwitch="ReturnSetUp" TexturePosition="Nightvision"/>
<SwitchOperation Description="夜视仪关" EnableSwitch="Nightvision1" DisableSwitch="ReturnSetUp" TexturePosition="Nightvision1"/>
    <SwitchOperation Description="塔克马静音" EnableSwitch="atv1"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.769531" Point_Y="0.304167" />
	</KeyMapping> 
	<KeyMapping ItemName="Shift" Point_X="0.846875" Point_Y="0.741667" Description="油门" AsciiCode="16">
	<SwitchOperation Description="油门" EnableSwitch="Throttle" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.846875" Point_Y="0.741667"/>
	</KeyMapping>
	<KeyMapping ItemName="Space" Point_X="0.952344" Point_Y="0.705556" Description="跳跃" AsciiCode="32" AutoCancel="0">
	<SwitchOperation Description="战斗机的刹车" EnableSwitch="jet"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.800878" Point_Y="0.582031" />
	<SwitchOperation Description="喷气芯片喷气" EnableSwitch="Blow" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.952344" Point_Y="0.705556" HideTips="1"/>
	<SwitchOperation Description="喷气芯片喷气中" EnableSwitch="Blow1" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.952344" Point_Y="0.705556" HideTips="1"/>
	<SwitchOperation Description="跳跃" EnableSwitch="Jump" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp"  Point_X="0.952344" Point_Y="0.705556" HideTips="1"/>
	<SwitchOperation Description="上潜" EnableSwitch="SwimUp"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.912109" Point_Y="0.753472" HideTips="1"/>
	<SwitchOperation Description="上潜中" EnableSwitch="SwimmingUp"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.912109" Point_Y="0.753472" HideTips="1"/>
	<SwitchOperation Description="刹车" EnableSwitch="Brake"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.838281" Point_Y="0.561111" />
	<SwitchOperation Description="刹车" EnableSwitch="Brake2"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.838281" Point_Y="0.561111" />
	</KeyMapping>
	<KeyMapping ItemName="Tab" Point_X="0.291406" Point_Y="0.858333" Description="背包" AsciiCode="9">
	<SwitchOperation Description="关背包" EnableSwitch="XBtn" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.973437" Point_Y="0.048611"/>
	<SwitchOperation Description="背包" EnableSwitch="Backpage" DisableSwitch="ReturnSetUp|CDX" Point_X="0.291406" Point_Y="0.858333" TexturePosition="Backpage"/>
	<SwitchOperation Description="2级背包" EnableSwitch="Backpage2" DisableSwitch="ReturnSetUp|CDX" Point_X="0.291406" Point_Y="0.858333" TexturePosition="Backpage2"/>
	<SwitchOperation Description="3级背包" EnableSwitch="Backpage3" DisableSwitch="ReturnSetUp|CDX" Point_X="0.291406" Point_Y="0.858333" TexturePosition="Backpage3"/>
	</KeyMapping>
	<KeyMapping ItemName="F" Point_X="0.607812" Point_Y="0.350000" Description="Scene: Drive, Open doors, Pick up, Parachute, Reviving"  AsciiCode="70" NoDelete="1" SpecialFunc="1002" OpGuidClass="0">
	<SwitchOperation Description="进入机甲" EnableSwitch="Mecha" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.516105" Point_Y="0.696615" />
    <SwitchOperation Description="离开机甲" EnableSwitch="Mecha1" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.945827" Point_Y="0.910156" />
    <SwitchOperation Description="取消离开" EnableSwitch="Mecha2" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.516105" Point_Y="0.696615" />
    <SwitchOperation Description="防空炮出" EnableSwitch="AAgun2" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.885798" Point_Y="0.425781" />
	<SwitchOperation Description="取消" EnableSwitch="YellowTriangle" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.591406" Point_Y="0.640278" TexturePosition="YellowTriangle"/>	
	<SwitchOperation Description="购物机确认" EnableSwitch="ShoppingMachine" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.496875" Point_Y="0.752778" />		
	<SwitchOperation Description="求助" EnableSwitch="HelpMe" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.500781" Point_Y="0.680556" />	
	<SwitchOperation Description="救人" EnableSwitch="Help" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.500000" Point_Y="0.645833" TexturePosition="Help"/>
	<SwitchOperation Description="弹跳" EnableSwitch="Bounce" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.621094" Point_Y="0.498611" TexturePosition="Bounce"/>
	<SwitchOperation Description="取消丢雷" EnableSwitch="CancelFireTheHole" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.155469" Point_Y="0.401389" TexturePosition="CancelFireTheHole"/>
	<SwitchOperation Description="打开礼物" EnableSwitch="Gift" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.622656" Point_Y="0.502778" TexturePosition="Gift"/>
	<SwitchOperation Description="下车" EnableSwitch="GetOutCar" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.943750" Point_Y="0.376389" HideTips="1"/>
	<SwitchOperation Description="开关门" EnableSwitch="DoorOpen" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.612500" Point_Y="0.555556"  TexturePosition="DoorOpen"/>
    <SwitchOperation Description="捡物" EnableSwitch="PickupDown" DisableSwitch="MapOpenFlag|InSetUp|SkillX|ReturnSetUp" Point_X="0.590776" Point_Y="0.497396" />
	<SwitchOperation Description="捡快递/空投" EnableSwitch="PacketLeft" DisableSwitch="MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.390922" Point_Y="0.486979" />
	<SwitchOperation Description="点开捡物（打开背包时）" EnableSwitch="XBtn|ClickPickupDown" Point_X="0.672656" Point_Y="0.304167"/>
	<SwitchOperation Description="点开捡物" EnableSwitch="ClickPickupDown" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.664714" Point_Y="0.299479" TexturePosition="ClickPickupDown"/>
	<SwitchOperation Description="点开快递包" EnableSwitch="ClickPacket" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.664714" Point_Y="0.299479"/>
	<SwitchOperation Description="跳伞（单人）" EnableSwitch="Parachute1" Point_X="0.230469" Point_Y="0.450000" TexturePosition="Parachute1"/>
	<SwitchOperation Description="跳伞（四人）" EnableSwitch="Parachute4" Point_X="0.230469" Point_Y="0.450000" TexturePosition="Parachute4"/>
	<SwitchOperation Description="缆车（恶魔岛）" EnableSwitch="Telpher" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.620313" Point_Y="0.502778" TexturePosition="Telpher"/>
	<SwitchOperation Description="了断（恶魔岛）" EnableSwitch="Suicide" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.500000" Point_Y="0.645833" TexturePosition="Suicide"/>
	<SwitchOperation Description="开伞" EnableSwitch="Parachute2" Point_X="0.230469" Point_Y="0.452778" TexturePosition="Parachute2"/>
	<SwitchOperation Description="上车" EnableSwitch="GetIntoCar" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.684375" Point_Y="0.559722" TexturePosition="GetIntoCar"/>
	<SwitchOperation Description="乘车(驾驶位有人)" EnableSwitch="ByCar"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.685937" Point_Y="0.718056"  TexturePosition="ByCar"/>
	<SwitchOperation Description="打开CD" EnableSwitch="CD"  DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.520312" Point_Y="0.659722"  TexturePosition="CD"/>	
	<SwitchOperation Description="暂停CD" EnableSwitch="CDX" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.718750" Point_Y="0.473611"  HideTips="0"/>	
	<SwitchOperation Description="缆绳" EnableSwitch="Cable"  DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.620313" Point_Y="0.502778" TexturePosition="Cable"/>   
	<SwitchOperation Description="缆绳中" EnableSwitch="CancelCable"  DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.620313" Point_Y="0.502778" TexturePosition="CancelCable"/>
	<SwitchOperation Description="升级技能" EnableSwitch="SkillUpgrade" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.547656" Point_Y="0.716667" TexturePosition="SkillUpgrade"/>
	<SwitchOperation Description="切换技能（出生地）" EnableSwitch="SkillCircle" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.514844" Point_Y="0.679167" TexturePosition="SkillCircle"/>
    <SwitchOperation Description="开启功能" EnableSwitch="OpenFunction" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.503906" Point_Y="0.659722" TexturePosition="OpenFunction"/>
	<SwitchOperation Description="异变围城扳手" EnableSwitch="Spanner" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp"  Point_X="0.763125" Point_Y="0.501111"/>
	<SwitchOperation Description="防空炮进" EnableSwitch="AAgun" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|GetOutCar|AAgun2" Point_X="0.622255" Point_Y="0.500000" />	
	<SwitchOperation Description="义肢使用" EnableSwitch="choose1" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|GetOutCar" Point_X="0.757687" Point_Y="0.700521" />	
	<SwitchOperation Description="离开小蜜蜂" EnableSwitch="tinybee" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|GetOutCar" Point_X="0.943750" Point_Y="0.376389" />
	<SwitchOperation Description="取消" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.515625" Point_Y="0.755556" HideTips="1"/>
	</KeyMapping>
	<KeyMapping ItemName="M" Point_X="0.967969" Point_Y="0.079167" Description="打开地图" AsciiCode="77">
	<SwitchOperation Description="打开地图" EnableSwitch="SetUp"  DisableSwitch="XBtn|SkillX|ReturnSetUp|CDX" Point_X="0.967969" Point_Y="0.079167"/>
	<SwitchOperation Description="关闭地图" EnableSwitch="MapOpenFlag"  Point_X="0.967969" Point_Y="0.079167"/>
	</KeyMapping>
	<KeyMapping ItemName="R" Point_X="0.770508" Point_Y="0.918403" Description="换弹" AsciiCode="82">
	<SwitchOperation Description="摄像头（躲猫猫）" EnableSwitch="Brpeekaboo" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|CDX" Point_X="0.930664" Point_Y="0.531250"/>
	<SwitchOperation Description="换弹" EnableSwitch="Reload" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|CDX"  TexturePosition="Reload"/>
	<SwitchOperation Description="滑雪板跳" EnableSwitch="Skijump" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|CDX" Point_X="0.739062" Point_Y="0.695370" TexturePosition="Ski1"/>
	<SwitchOperation Description="蜜蜂扫描" EnableSwitch="tinybee" Point_X="0.680625" Point_Y="0.727778" />
	</KeyMapping>
	<KeyMappingEx ItemName="WASD" Point_X="0.203125" Point_Y="0.736111" Description="移动" HideTipsAlways="1" Type="CrossKey" UP_AsciiCode="87" DOWN_AsciiCode="83" LEFT_AsciiCode="65" RIGHT_AsciiCode="68" Offset="0.070258" ShiftOffset="0.1">
	<SwitchOperation Description="移动" EnableSwitch="SetUp" DisableSwitch="DriveMode1|DriveMode1Press"/>
	<SwitchOperation Description="移动" EnableSwitch="XBtn" DisableSwitch="DriveMode1|DriveMode1Press"/>
	<SwitchOperation Description="移动" EnableSwitch="SteeringWheel" DisableSwitch="DriveMode1|DriveMode1Press"/>
	<SwitchOperation Description="移动" EnableSwitch="Squat" DisableSwitch="DriveMode1|DriveMode1Press"/>
	<SwitchOperation Description="移动" EnableSwitch="Jump" DisableSwitch="DriveMode1|DriveMode1Press"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="左键" Point_X="0.060937" Point_Y="0.519444" Description="开火" Type="LClick" AutoActive="1" LOCK_AsciiCode="192" LOCK_AsciiCode2="17">
	<SwitchOperation Description="战斗机机关枪" EnableSwitch="jet" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.731332" Point_Y="0.691406"/>
	<SwitchOperation Description="锁定（躲猫猫）" EnableSwitch="Flash2"  DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX"  Point_X="0.848437" Point_Y="0.709722"  HideTips="1"/>
	<SwitchOperation Description="鸣笛" EnableSwitch="Whistle"  DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.965625" Point_Y="0.720833" HideTips="1"/>
	<SwitchOperation Description="鸣笛中" EnableSwitch="Whistling"  DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.965625" Point_Y="0.720833" HideTips="1"/>
	<SwitchOperation Description="上飞" EnableSwitch="FlyUp"  DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.885156" Point_Y="0.541667" HideTips="1"/>
	<SwitchOperation Description="射击" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX|Shield|" Point_X="0.854688" Point_Y="0.745833" HideTips="1"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="" Point_X="0.581250" Point_Y="0.570833" Description="视角" HideTipsAlways="1" Type="RClick" AutoActive="1" LOCK_AsciiCode="192" LOCK_AsciiCode2="17" AsciiCode="17" Offset="0.450000" Raw="1">
	<SwitchOperation Description="视角" EnableSwitch="SetUp" DisableSwitch="MapOpenFlag|XBtn|EmojiPressed|InSetUp|ReturnSetUp|SkillX|BreastPatting|CDX|Change|choose|newmap1|newmap2"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="Alt" Point_X="0.716406" Point_Y="0.358333" Description="Free view" HideTipsAlways="1" InUseDisableView="1" NoDelete="1" SpecialFunc="0" OpGuidClass="0" Type="KeyMove" Offset="0.99" Click_X="0.716406" Click_Y="0.358333" Click_Offset="0.450000" AsciiCode="18" Cancel_X="-0.911133" Cancel_Y="-0.277778" Click_Left="1" ReleaseNow="0" Center_X="0.000000" Center_Y="0.000000" StopMoving="0" NeedPressed="1" Center_XY_Disable="1">
	<SwitchOperation Description="Free view" EnableSwitch="Eye" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX"/>
	<SwitchOperation Description="Free view" EnableSwitch="OpenEye" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX"/>
	</KeyMappingEx>
	<KeyMapping ItemName="G" Point_X="0.514844" Point_Y="0.677778" Description="乘车" AsciiCode="71">
	<SwitchOperation Description="切换技能（复活专机）" EnableSwitch="SkillCircle|Parachute1" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.476563" Point_Y="0.652500" />
	<SwitchOperation Description="换形（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.729688" Point_Y="0.830556" />		
	<SwitchOperation Description="乘车" EnableSwitch="ByCar|GetIntoCar"  DisableSwitch="XBtn|MapOpenFlag" Point_X="0.685937" Point_Y="0.718056"  TexturePosition="ByCar"/>
	<SwitchOperation Description="捡物" EnableSwitch="PickupDown" DisableSwitch="MapOpenFlag|SkillX" Point_X="0.590776" Point_Y="0.600260"/>
	<SwitchOperation Description="捡快递/空投" EnableSwitch="PacketLeft" DisableSwitch="MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.546852" Point_Y="0.492188" />
	<SwitchOperation Description="鸣笛" EnableSwitch="Whistle"  DisableSwitch="XBtn|MapOpenFlag" Point_X="0.965625" Point_Y="0.720833"/>
	<SwitchOperation Description="鸣笛中" EnableSwitch="Whistling"  DisableSwitch="XBtn|MapOpenFlag" Point_X="0.965625" Point_Y="0.720833"/>
	<SwitchOperation Description="蜜蜂侵入" EnableSwitch="tinybee"  DisableSwitch="XBtn|MapOpenFlag" Point_X="0.651250" Point_Y="0.798889"/>
	<SwitchOperation Description="防弹插板" EnableSwitch="Bulletproof" DisableSwitch="ReturnSetUp" EnablePositionSwitch="Bulletproof:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Bulletproof"/>
    <SwitchOperation Description="防弹衣" EnableSwitch="Armor" DisableSwitch="ReturnSetUp" EnablePositionSwitch="Armor:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Armor"/>
	<SwitchOperation Description="普通护甲" EnableSwitch="Carmor" DisableSwitch="ReturnSetUp" EnablePositionSwitch="Carmor:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Carmor"/>
	<SwitchOperation Description="高级护甲" EnableSwitch="Aarmor" DisableSwitch="ReturnSetUp" EnablePositionSwitch="Aarmor:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Aarmor"/>
	<SwitchOperation Description="特级护甲" EnableSwitch="Tarmor" DisableSwitch="ReturnSetUp" EnablePositionSwitch="Tarmor:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Tarmor"/>
    <SwitchOperation Description="Open" EnableSwitch="Open" EnablePositionSwitch="Open:0.068594,0.516667,0.423438,0.958333"  TexturePosition="Open" HideTips="1"/>
    <SwitchOperation Description="Close" EnableSwitch="Close" EnablePositionSwitch="Close:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Close" HideTips="1"/>
	<SwitchOperation Description="新地图吃药" EnableSwitch="Reload" DisableSwitch="Backpage|Backpage2|Backpage3|GetOutCar" Point_X="0.766146" Point_Y="0.760185" />
	</KeyMapping>
	<KeyMapping ItemName="H" Point_X="0.668945" Point_Y="0.607639" Description="捡物" AsciiCode="72">
	<SwitchOperation Description="捡物" EnableSwitch="PickupDown" DisableSwitch="MapOpenFlag|SkillX" Point_X="0.590044" Point_Y="0.704427"/>
	<SwitchOperation Description="捡快递/空投" EnableSwitch="PacketLeft" DisableSwitch="MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.387994" Point_Y="0.615885" />
	</KeyMapping>
	<KeyMapping ItemName="C" Point_X="0.854492" Point_Y="0.918403" Description="下蹲" AsciiCode="67" >
	<SwitchOperation Description="下蹲" EnableSwitch="Squat" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.854492" Point_Y="0.918403" HideTips="1"/>
	<SwitchOperation Description="取消下蹲" EnableSwitch="CancelSquat" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp"  Point_X="0.854492" Point_Y="0.918403" HideTips="1"/>
	<SwitchOperation Description="下潜" EnableSwitch="SwimDown"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp"  Point_X="0.854492" Point_Y="0.918403"  HideTips="1"/>
	<SwitchOperation Description="下潜中" EnableSwitch="SwimmingDown"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.854492" Point_Y="0.918403" HideTips="1"/>
	<SwitchOperation Description="换位置" EnableSwitch="GetOutCar"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.963281" Point_Y="0.933333" HideTips="0"/>
	<SwitchOperation Description="取消趴下" EnableSwitch="CancelFall"  DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.854492" Point_Y="0.918403" HideTips="1"/>
	</KeyMapping>
	<KeyMapping ItemName="Z" Point_X="0.947761" Point_Y="0.847513" Description="趴下" AsciiCode="90">
    <SwitchOperation Description="趴下" EnableSwitch="Fall" DisableSwitch="InSetUp" Point_X="0.947761" Point_Y="0.847513" HideTips="1"/>
    <SwitchOperation Description="取消趴下" EnableSwitch="CancelFall" DisableSwitch="InSetUp" Point_X="0.947761" Point_Y="0.847513" HideTips="1"/>
    </KeyMapping>
	<KeyMappingEx ItemName="鼠标滚轮" Point_X="0.644531" Point_Y="0.495000" Description="捡东西鼠标滚轮" HideTipsAlways="1" Type="WheelSlip" Up_X="0.000000" Up_Y="0.050000" Down_X="0.000000" Down_Y="-0.050000" Offset="0.003" Speed="3.000000"> 
	<SwitchOperation Description="捡物(打开背包时)" EnableSwitch="PickupDown|XBtn" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.571875" Point_Y="0.504167"/>
	<SwitchOperation Description="捡快递/空投" EnableSwitch="PacketLeft" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.547656" Point_Y="0.426389"/>
	<SwitchOperation Description="捡物" EnableSwitch="PickupDown" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.571875" Point_Y="0.504167"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="鼠标滚轮" Description="滚轮缩放" Type="WheelZoom"  Point_X="0.686725" Point_Y="0.535832" HideTipsAlways="1" NeedCtrl="false" Duration="75" Gap="60" OuterDiameter="50" InnerDiameter="20">
	<SwitchOperation Description="地图" EnableSwitch="MapOpenFlag" />
	</KeyMappingEx>
	<KeyMappingEx ItemName="滚轮切枪" Click_X="0.428125" Click_Y="0.855556" Point_X="0.546094" Point_Y="0.863889" Description="滚轮切枪" Type="WheelClick"  HideTipsAlways="1">
	<SwitchOperation Description="背包" EnableSwitch="Backpage" DisableSwitch="XBtn|MapOpenFlag|PickupDown|PacketLeft|ReturnSetUp" />
	<SwitchOperation Description="2级背包" EnableSwitch="Backpage2" DisableSwitch="XBtn|MapOpenFlag|PickupDown|PacketLeft|ReturnSetUp" />
	<SwitchOperation Description="3级背包" EnableSwitch="Backpage3" DisableSwitch="XBtn|MapOpenFlag|PickupDown|PacketLeft|ReturnSetUp" />
	</KeyMappingEx>
	<KeyMapping ItemName="右键" Point_X="0.883333" Point_Y="0.558333" Description="右键开镜"  ShowOnLockAsciiCode="192" AsciiCode="-2">
	<SwitchOperation Description="下飞" EnableSwitch="FlyDown" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.885938" Point_Y="0.787500" HideTips="1"/>
	<SwitchOperation Description="瞄准" EnableSwitch="Sniper" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX|newmap3" Point_X="0.883333" Point_Y="0.558333"  HideTips="1"/>
	<SwitchOperation Description="取消瞄准" EnableSwitch="Sniper2|Reload" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX|newmap3" Point_X="0.883333" Point_Y="0.558333" HideTips="1"/>
	<SwitchOperation Description="瞄准" EnableSwitch="Sniper|newmap3" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.960625" Point_Y="0.514444" HideTips="1" />
	<SwitchOperation Description="取消瞄准" EnableSwitch="Sniper2|newmap3" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.960625" Point_Y="0.514444" HideTips="1" />
	<SwitchOperation Description="取消瞄准（坦克）" EnableSwitch="Sniper2" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.963867" Point_Y="0.520833" HideTips="1"/>
	<SwitchOperation Description="取消瞄准（坦克）" EnableSwitch="Tank1" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.963867" Point_Y="0.520833" HideTips="1"/>
	<SwitchOperation Description="取消瞄准（坦克）" EnableSwitch="Sniper2" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.963867" Point_Y="0.520833" HideTips="1"/>	
	<SwitchOperation Description="取消瞄准（坦克）" EnableSwitch="Tank2" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.963867" Point_Y="0.520833" HideTips="1"/>
	<SwitchOperation Description="取消僵尸雷" EnableSwitch="Sniper2" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.060937" Point_Y="0.519444" HideTips="0"/>
	<SwitchOperation Description="打开地图时取消标记" EnableSwitch="MapOpenFlag"  Point_X="0.663281" Point_Y="0.919444" HideTips="0"/>
	<SwitchOperation Description="刀" EnableSwitch="Knife" DisableSwitch="XBtn|MapOpenFlag|BreastPatting|ReturnSetUp|SkillX" Point_X="0.060937" Point_Y="0.519444" HideTips="1"/>
	<SwitchOperation Description="战斗机导弹" EnableSwitch="jet" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.746706" Point_Y="0.851563"/>
	</KeyMapping>
	<KeyMapping ItemName="1" Point_X="0.427344" Point_Y="0.852778" Description="换1号武器" AsciiCode="49" >
	<SwitchOperation Description="换1号武器" EnableSwitch="Backpage" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.427344" Point_Y="0.852778" HideTips="0"/>
	<SwitchOperation Description="换1号武器" EnableSwitch="Backpage2" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.427344" Point_Y="0.852778" HideTips="0"/>
	<SwitchOperation Description="换1号武器" EnableSwitch="Backpage3" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.427344" Point_Y="0.852778" HideTips="0"/>
	<SwitchOperation Description="换1号武器" EnableSwitch="Reload" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.427344" Point_Y="0.852778" HideTips="0"/>
	<SwitchOperation Description="换1号武器" EnableSwitch="SetUp" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.427344" Point_Y="0.852778" HideTips="0"/>
	</KeyMapping>
	<KeyMapping ItemName="2" Point_X="0.539063" Point_Y="0.862500" Description="换2号武器" AsciiCode="50" >
	<SwitchOperation Description="换2号武器" EnableSwitch="Backpage" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.539063" Point_Y="0.862500" HideTips="0"/>
	<SwitchOperation Description="换2号武器" EnableSwitch="Backpage2" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.539063" Point_Y="0.862500" HideTips="0"/>
	<SwitchOperation Description="换2号武器" EnableSwitch="Backpage3" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.539063" Point_Y="0.862500" HideTips="0"/>
	<SwitchOperation Description="换2号武器" EnableSwitch="Reload" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.539063" Point_Y="0.862500" HideTips="0"/>
	<SwitchOperation Description="换2号武器" EnableSwitch="SetUp" DisableSwitch="MapOpenFlag|ReturnSetUp|Whistle|FlyDown|Whistling|XBtn|CDX" Point_X="0.539063" Point_Y="0.862500" HideTips="0"/>
	</KeyMapping>
	<KeyMappingEx ItemName="3" Point_X="0.629687" Point_Y="0.848611" Description="手雷" Type="FoldClick2" AsciiCode="51" >
	<SwitchOperation Description="震爆弹" EnableSwitch="Detonation" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="Detonation:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Detonation"/>
	<SwitchOperation Description="新年手雷" EnableSwitch="Grenadesn" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="Grenadesn:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Grenadesn"/>
	<SwitchOperation Description="雪人手雷" EnableSwitch="Snow" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="Snow:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Snow"/>
	<SwitchOperation Description="Open" EnableSwitch="Open" EnablePositionSwitch="Open:0.482812,0.606944,0.931250,0.958333"  TexturePosition="Open" HideTips="1"/>
	<SwitchOperation Description="Close" EnableSwitch="Close" EnablePositionSwitch="Close:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Close" HideTips="1"/>
	<SwitchOperation Description="新地图道具1" EnableSwitch="Reload" DisableSwitch="Backpage|Backpage2|Backpage3|GetOutCar" Point_X="0.366667" Point_Y="0.856481" />
	<SwitchOperation Description="新地图道具2" EnableSwitch="newmap3" DisableSwitch="Backpage|Backpage2|Backpage3|GetOutCar" Point_X="0.366667" Point_Y="0.856481" />
	</KeyMappingEx>
	<KeyMappingEx ItemName="4" Point_X="0.629687" Point_Y="0.848611" Description="手雷" Type="FoldClick2" AsciiCode="52" >
	<SwitchOperation Description="集束炸弹" EnableSwitch="Cluster" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="Cluster:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Cluster"/>
	<SwitchOperation Description="手榴弹" EnableSwitch="Grenade" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="Grenade:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Grenade"/>
	<SwitchOperation Description="Open" EnableSwitch="Open" EnablePositionSwitch="Open:0.482812,0.606944,0.931250,0.958333"  TexturePosition="Open" HideTips="1"/>
	<SwitchOperation Description="Close" EnableSwitch="Close" EnablePositionSwitch="Close:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Close" HideTips="1"/>
	<SwitchOperation Description="新地图道具2" EnableSwitch="Reload" DisableSwitch="Backpage|Backpage2|Backpage3|GetOutCar" Point_X="0.305208" Point_Y="0.860185" />
	</KeyMappingEx>
	<KeyMappingEx ItemName="5" Point_X="0.629687" Point_Y="0.848611" Description="手雷" Type="FoldClick2" AsciiCode="53" >
	<SwitchOperation Description="毒气弹" EnableSwitch="Gas" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="Gas:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Gas"/>
	<SwitchOperation Description="烟雾弹" EnableSwitch="Smoke" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="Smoke:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Smoke"/>
	<SwitchOperation Description="Open" EnableSwitch="Open" EnablePositionSwitch="Open:0.482812,0.606944,0.931250,0.958333"  TexturePosition="Open" HideTips="1"/>
	<SwitchOperation Description="Close" EnableSwitch="Close" EnablePositionSwitch="Close:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Close" HideTips="1"/>
	<SwitchOperation Description="新地图道具3" EnableSwitch="Reload" DisableSwitch="Backpage|Backpage2|Backpage3|GetOutCar" Point_X="0.250000" Point_Y="0.866667" />
	</KeyMappingEx>
	<KeyMappingEx ItemName="6" Point_X="0.629687" Point_Y="0.848611" Description="手雷" Type="FoldClick2" AsciiCode="54" >
	<SwitchOperation Description="连环闪光弹" EnableSwitch="SerialFlash" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="SerialFlash:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="SerialFlash"/>
	<SwitchOperation Description="闪光弹" EnableSwitch="Flash" DisableSwitch="ReturnSetUp|MapOpenFlag" EnablePositionSwitch="Flash:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Flash"/>
	<SwitchOperation Description="Open" EnableSwitch="Open" EnablePositionSwitch="Open:0.482812,0.606944,0.931250,0.958333"  TexturePosition="Open" HideTips="1"/>
	<SwitchOperation Description="Close" EnableSwitch="Close" EnablePositionSwitch="Close:0.482812,0.606944,0.931250,0.958333"  NotifyController="1" TexturePosition="Close" HideTips="1"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="7" Point_X="0.350000" Point_Y="0.855556" Description="吃药" Type="FoldClick2" AsciiCode="55" >
	<SwitchOperation Description="止血凝胶" EnableSwitch="HemostaticGel" DisableSwitch="ReturnSetUp" EnablePositionSwitch="HemostaticGel:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="HemostaticGel"/>
	<SwitchOperation Description="Open" EnableSwitch="Open" EnablePositionSwitch="Open:0.068594,0.516667,0.423438,0.958333"  TexturePosition="Open" HideTips="1"/>
	<SwitchOperation Description="Close" EnableSwitch="Close" EnablePositionSwitch="Close:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Close" HideTips="1"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="8" Point_X="0.350000" Point_Y="0.855556" Description="吃药" Type="FoldClick2" AsciiCode="56" >
	<SwitchOperation Description="急救包" EnableSwitch="FirstAidKit" DisableSwitch="ReturnSetUp" EnablePositionSwitch="FirstAidKit:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="FirstAidKit"/>
	<SwitchOperation Description="Open" EnableSwitch="Open" EnablePositionSwitch="Open:0.068594,0.516667,0.423438,0.958333"  TexturePosition="Open" HideTips="1"/>
	<SwitchOperation Description="Close" EnableSwitch="Close" EnablePositionSwitch="Close:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Close" HideTips="1"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="9" Point_X="0.350000" Point_Y="0.855556" Description="吃药" Type="FoldClick2" AsciiCode="57" >
	<SwitchOperation Description="止痛针" EnableSwitch="AnalgesicNeedle" DisableSwitch="ReturnSetUp" EnablePositionSwitch="AnalgesicNeedle:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="AnalgesicNeedle"/>
	<SwitchOperation Description="Open" EnableSwitch="Open" EnablePositionSwitch="Open:0.068594,0.516667,0.423438,0.958333"  TexturePosition="Open" HideTips="1"/>
	<SwitchOperation Description="Close" EnableSwitch="Close" EnablePositionSwitch="Close:0.068594,0.516667,0.423438,0.958333"  NotifyController="1" TexturePosition="Close" HideTips="1"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="T" Point_X="0.767188" Point_Y="0.138889" Description="开启/关闭广播" AsciiCode="84" Type="MultiPoint" HideTipsAlways="0" >
	<SwitchOperation Description="开启/静音广播" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp|CDX"/>
	<Point Point_X="0.646875" Point_Y="0.143056" Description="字母键" Delay="300" IsMutex="1" MutexVal="1"/>
	<Point Point_X="0.713281" Point_Y="0.140278" Description="字母键" Delay="300" IsMutex="1" MutexVal="0"/>
	</KeyMappingEx>
	<KeyMappingEx ItemName="Y" Point_X="0.767969" Point_Y="0.220833" Description="开启/关闭语音" AsciiCode="89" Type="MultiPoint" HideTipsAlways="0" >
	<SwitchOperation Description="开启/关闭语音" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp|Voice|CDX"/>
	<Point Point_X="0.645312" Point_Y="0.255556" Description="字母键" Delay="300" IsMutex="1" MutexVal="1"/>
	<Point Point_X="0.714063" Point_Y="0.256944" Description="字母键" Delay="300" IsMutex="1" MutexVal="0"/>
	</KeyMappingEx>
	<KeyMapping ItemName="Y" Point_X="0.767969" Point_Y="0.220833" Description="语音按住"  AsciiCode="89">
    <SwitchOperation Description="语音按住" EnableSwitch="Voice" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp|CDX"/>
    </KeyMapping>
	<KeyMapping ItemName="B" Point_X="0.445313" Point_Y="0.788889" Description="单发/连发" AsciiCode="66"  HideTipsAlways="0">
	<SwitchOperation Description="单发/连发" EnableSwitch="FireMode1" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|CDX" Point_X="0.445313" Point_Y="0.788889"/>
	<SwitchOperation Description="单发/连发" EnableSwitch="FireMode2" DisableSwitch="XBtn|MapOpenFlag|InSetUp|ReturnSetUp|CDX" Point_X="0.582812" Point_Y="0.794444"/>
	</KeyMapping>
	<KeyMapping ItemName="Esc" Point_X="0.765625" Point_Y="0.050000" Description="打开设置" AsciiCode="27" Type="MultiPoint" HideTipsAlways="0">
	<SwitchOperation Description="关闭购物机" EnableSwitch="ShoppingMachine" Point_X="0.563281" Point_Y="0.669444" />		
	<SwitchOperation Description="关闭CD" EnableSwitch="CDX" Point_X="0.798438" Point_Y="0.243056" TexturePosition="CDX"/>	
	<SwitchOperation Description="关闭捡物（打开背包时）" EnableSwitch="XBtn|PickupDown" Point_X="0.672656" Point_Y="0.304167"/>
	<SwitchOperation Description="关闭捡物" EnableSwitch="PickupDown" DisableSwitch="ReturnSetUp"  Point_X="0.715625" Point_Y="0.277778"/>
	<SwitchOperation Description="关闭快递" EnableSwitch="PacketLeft" DisableSwitch="ReturnSetUp" Point_X="0.668750" Point_Y="0.204167"/>
	<SwitchOperation Description="返回设置" EnableSwitch="ReturnSetUp" Point_X="0.033203" Point_Y="0.052083" />
	<SwitchOperation Description="关闭设置" EnableSwitch="InSetUp" Point_X="0.675000" Point_Y="0.504167" TexturePosition="InSetUp"/>
	<SwitchOperation Description="打开设置" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|InSetUp|SkillX|ReturnSetUp" Point_X="0.765625" Point_Y="0.050000"/>
	</KeyMapping>
	<KeyMapping ItemName="E" Point_X="0.943750" Point_Y="0.376389" Description="技能" AsciiCode="69" HideTipsAlways="0">
	<SwitchOperation Description="蜜蜂第三视角" EnableSwitch="tinybee" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.531250" Point_Y="0.764444"/>
	<SwitchOperation Description="塔克马载具机枪下" EnableSwitch="atv2" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.853125" Point_Y="0.465556"/>
	<SwitchOperation Description="塔克马载具机枪" EnableSwitch="atv" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.853125" Point_Y="0.465556"/>
	<SwitchOperation Description="战斗机的干扰弹" EnableSwitch="jet" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.910688" Point_Y="0.582031"/>
	<SwitchOperation Description="新空投确认" EnableSwitch="Airdrop4" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.506250" Point_Y="0.666667"/>	
	<SwitchOperation Description="下飞（躲猫猫）" EnableSwitch="Brpeekaboo1" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.723633" Point_Y="0.751736"/>		
	<SwitchOperation Description="购物机上一个" EnableSwitch="ShoppingMachine"  DisableSwitch="MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.606250" Point_Y="0.695833" />			
	<SwitchOperation Description="CD上一首" EnableSwitch="CDX"  DisableSwitch="MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.587500" Point_Y="0.590278" />		
	<SwitchOperation Description="抬头（摩托）" EnableSwitch="Moto1"  DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.741406" Point_Y="0.744444" />	
	<SwitchOperation Description="抬头按住（摩托）" EnableSwitch="Moto2"  DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.741406" Point_Y="0.744444" />	
	<SwitchOperation Description="飞机的干扰弹" EnableSwitch="Jamming"  DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.770312" Point_Y="0.609722" TexturePosition="Jamming"/>
	<SwitchOperation Description="直升飞机的攻击" EnableSwitch="Helicopter"  DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.911875" Point_Y="0.543333" TexturePosition="Helicopter"/>		
	<SwitchOperation Description="坦克的干扰弹" EnableSwitch="Tank1"  DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.905469" Point_Y="0.625000" TexturePosition="Tank1"/>		
	<SwitchOperation Description="坦克的干扰弹" EnableSwitch="Tank2"  DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.905469" Point_Y="0.625000" TexturePosition="Tank2"/>
	<SwitchOperation Description="足球" EnableSwitch="football"  DisableSwitch="XBtn|MapOpenFlag" Point_X="0.822500" Point_Y="0.630000"/>			
	<SwitchOperation Description="技能" EnableSwitch="SetUp"  DisableSwitch="XBtn|MapOpenFlag|GetOutCar|SkillX|ReturnSetUp" Point_X="0.943750" Point_Y="0.376389" HideTips="0"/>
	</KeyMapping>
	<KeyMapping ItemName="Q" Point_X="0.717187" Point_Y="0.275000" Description="点开捡物/快递" AsciiCode="81" HideTipsAlways="0">
	<SwitchOperation Description="闪光弹（躲猫猫）" EnableSwitch="Flash2" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.824686" Point_Y="0.914566"/>
	<SwitchOperation Description="上飞（躲猫猫）" EnableSwitch="Brpeekaboo1" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.727539" Point_Y="0.508681"/>
	<SwitchOperation Description="新空投翻页" EnableSwitch="Airdrop4" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.621875" Point_Y="0.659722" TexturePosition="Airdrop4"/>	
	<SwitchOperation Description="坦克夜视" EnableSwitch="Tank3" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.782813" Point_Y="0.608333" TexturePosition="Tank3"/>		
	<SwitchOperation Description="坦克夜视" EnableSwitch="Tank4" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.782813" Point_Y="0.608333" TexturePosition="Tank4"/>			
	<SwitchOperation Description="购物机下一个" EnableSwitch="ShoppingMachine"  DisableSwitch="MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.392188" Point_Y="0.697222" />			
	<SwitchOperation Description="CD下一首" EnableSwitch="CDX"  DisableSwitch="MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.369531" Point_Y="0.588889" />			
	<SwitchOperation Description="抬头（摩托）" EnableSwitch="Moto1" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.741406" Point_Y="0.566667" />	
	<SwitchOperation Description="抬头按住（摩托）" EnableSwitch="Moto2" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp" Point_X="0.741406" Point_Y="0.566667" />		
	<SwitchOperation Description="点开捡物（捡快递、背包存在）" EnableSwitch="PacketLeft|ClickPickupDown|XBtn" DisableSwitch="MapOpenFlag|InSetUp|SkillX" Point_X="0.672656" Point_Y="0.304167" />
	<SwitchOperation Description="点开捡物（捡快递存在）" EnableSwitch="PacketLeft|ClickPickupDown" DisableSwitch="MapOpenFlag|InSetUp|SkillX" Point_X="0.717187" Point_Y="0.275000" />
	<SwitchOperation Description="点开快递（捡物存在）" EnableSwitch="PickupDown|ClickPacket" DisableSwitch="MapOpenFlag|InSetUp|SkillX" Point_X="0.668750" Point_Y="0.204167" />
	<SwitchOperation Description="点开快递（点开捡物存在）" EnableSwitch="ClickPickupDown|ClickPacket" DisableSwitch="MapOpenFlag|InSetUp|SkillX" Point_X="0.668750" Point_Y="0.204167" />
	<SwitchOperation Description="滑雪板" EnableSwitch="Ski" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" Point_X="0.759375" Point_Y="0.615741" TexturePosition="Ski"/>	
	<SwitchOperation Description="蜜蜂第一视角" EnableSwitch="tinybee" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.475625" Point_Y="0.764444"/>
	<SwitchOperation Description="足球" EnableSwitch="football"  DisableSwitch="XBtn|MapOpenFlag" Point_X="0.783125" Point_Y="0.707778"/>
	</KeyMapping>
	<KeyMappingEx ItemName="开车第一种模式" Point_X="0.5" Point_Y="0.5" Description="开车" HideTipsAlways="1" Type="Drive">
	<SwitchOperation Description="第一种开车模式" EnableSwitch="DriveMode1"   DisableSwitch="Jump"/>
	<SwitchOperation Description="第一种开车模式_按着" EnableSwitch="DriveMode1Press"   DisableSwitch="Jump"/>
	<DriveKey AsciiCode="65" Point_X="0.723437" Point_Y="0.701389" KeyName="A" Description="左"/>
	<DriveKey AsciiCode="68" Point_X="0.865625" Point_Y="0.702778" KeyName="D" Description="右"/>
	<DriveKey AsciiCode="87" Point_X="0.166406" Point_Y="0.534722" KeyName="W" Description="上"/>
	<DriveKey AsciiCode="83" Point_X="0.163281" Point_Y="0.770833" KeyName="S" Description="下"/>
	</KeyMappingEx>
	<KeyMapping ItemName="F4" Point_X="0.722656" Point_Y="0.045833" Description="表情" AsciiCode="115">
	<SwitchOperation Description="表情" EnableSwitch="Emoji" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp|CDX" TexturePosition="Emoji"/>
	<SwitchOperation Description="表情" EnableSwitch="BreastPatting" DisableSwitch="XBtn|MapOpenFlag|ReturnSetUp" TexturePosition="BreastPatting"/>
	</KeyMapping>
	<KeyMappingEx ItemName="X" Point_X="0.867969" Point_Y="0.318056" Description="信号" InUseDisableView="1" NoDelete="1" SpecialFunc="0" OpGuidClass="0" Type="KeyMove" Offset="0.49"  AsciiCode="88" Cancel_X="-0.911133" Cancel_Y="-0.277778" Click_X="0.867969" Click_Y="0.318056" Click_Offset="0.450000" Click_Left="1" ReleaseNow="0" Center_X="0.000000" Center_Y="0.000000" StopMoving="0" NeedPressed="1" Center_XY_Disable="1">
	<SwitchOperation Description="信号" EnableSwitch="SetUp" DisableSwitch="XBtn|MapOpenFlag|SkillX|ReturnSetUp|WatchTeammates|CDX"/>
	</KeyMappingEx>
	<KeyMapping ItemName="V" Point_X="0.120313" Point_Y="0.902778" Description="第1/3人称切换" AsciiCode="86">
	<SwitchOperation Description="第1/3人称切换" EnableSwitch="SetUp"   DisableSwitch="SkillX|ReturnSetUp|CDX"  Point_X="0.120313" Point_Y="0.902778" />
	</KeyMapping>
	<KeyMapping ItemName="Capslock" Point_X="0.846875" Point_Y="0.741667" Description="战斗机加速/特殊载具跳跃" AsciiCode="20" HideTipsAlways="0">
	<SwitchOperation Description="战斗机加速" EnableSwitch="jet" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.846875" Point_Y="0.741667"/>
	<SwitchOperation Description="拳套加速" EnableSwitch="box" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.734375" Point_Y="0.840000" />
	<SwitchOperation Description="塔克马载具跳" EnableSwitch="atv1" DisableSwitch="MapOpenFlag|ReturnSetUp" Point_X="0.740000" Point_Y="0.748889" />
	</KeyMapping>
</KeyMapMode>
</Item>
"""
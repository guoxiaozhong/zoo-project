package cn.lhcz.name.info.datainfo;

import java.util.HashMap;
import java.util.Map;

public class Data {

     // 天干
     String[]  heavenlyStem = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
     // 地支
     String[] earthyBranch = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};

     // 属相
     String[] zodiacs = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "子", "狗", "猪"};

     // 干支
     String[] stemBranchTable = {
             "甲子", "乙丑", "丙寅", "丁卯", "戊辰", "己巳", "庚午", "辛未", "壬申", "癸酉", "甲戌", "乙亥", //甲或己日
             "丙子", "丁丑", "戊寅", "己卯", "庚辰", "辛巳", "壬午", "癸未", "甲申", "乙酉", "丙戌", "丁亥", //乙或庚日
             "戊子", "己丑", "庚寅", "辛卯", "壬辰", "癸巳", "甲午", "乙未", "丙申", "丁酉", "戊戌", "己亥", //丙或辛日
             "庚子", "辛丑", "壬寅", "癸卯", "甲辰", "乙巳", "丙午", "丁未", "戊申", "己酉", "庚戌", "辛亥", //丁或壬日
             "壬子", "癸丑", "甲寅", "乙卯", "丙辰", "丁巳", "戊午", "己未", "庚申", "辛酉", "壬戌", "癸亥", //戊或癸日
     };
     //
     int[] yearNumber = {
             0x9, 0xE, 0x13, 0x18, 0x1E, 0x23, 0x28, 0x2D, 0x33, 0x38, //1900-1909
             0x1, 0x6, 0xC, 0x11, 0x16, 0x1B, 0x21, 0x26, 0x2B, 0x30, //1910-1919
             0x36, 0x3B, 0x4, 0x9, 0xF, 0x14, 0x19, 0x1E, 0x24, 0x36, //1920-1929
             0x2E, 0x33, 0x39, 0x2, 0x7, 0xC, 0x12, 0x17, 0x1C, 0x2E, //1930-1939
             0x27, 0x2C, 0x31, 0x36, 0x0, 0x5, 0xA, 0xF, 0x15, 0x1A, //1940-1949
             0x1F, 0x24, 0x2A, 0x2F, 0x34, 0x39, 0x3, 0x8, 0xD, 0x12, //1950-1959
             0x18, 0x1D, 0x22, 0x27, 0x2D, 0x32, 0x37, 0x0, 0x6, 0xB, //1960-1969
             0x10, 0x15, 0x1B, 0x20, 0x25, 0x2A, 0x30, 0x35, 0x3A, 0x3, //1970-1979
             0x9, 0xE, 0x13, 0x18, 0x1E, 0x23, 0x28, 0x2D, 0x33, 0x38, //1980-1989
             0x1, 0x6, 0xC, 0x11, 0x16, 0x1B, 0x21, 0x26, 0x2B, 0x30, //1990-1999
             0x36, 0x3B, 0x4, 0x9, 0xF, 0x14, 0x19, 0x1E, 0x24, 0x29, //2000-2009
             0x2E, 0x33, 0x39, 0x2, 0x7, 0xC, 0x12, 0x17, 0x1C, 0x21, //2010-2019
             0x27, 0x2C, 0x31, 0x36, 0x0, 0x5, 0xA, 0xF, 0x15, 0x1A, //2020-2029
             0x1F, 0x24, 0x2A, 0x2F, 0x34, 0x39, 0x3, 0x8, 0xD, 0x12, //2030-2039
             0x18, 0x1D, 0x22, 0x27, 0x2D, 0x32, 0x37, 0x0, 0x6, 0xB, //2040-2049
             0x10, 0x15, 0x1B, 0x20, 0x25, 0x2A, 0x30, 0x35, 0x3A, 0x3, //2050-2059
             0x9, 0xE, 0x13, 0x18, 0x1E, 0x23, 0x28, 0x2D, 0x33, 0x38, //2060-2069
             0x1, 0x6, 0xC, 0x11, 0x16, 0x1B, 0x21, 0x26, 0x2B, 0x30, //2070-2079
             0x36, 0x3B, 0x4, 0x9, 0xF, 0x14, 0x19, 0x1E, 0x24, 0x29, //2080-2089
             0x2E, 0x33, 0x39, 0x2, 0x7, 0xC, 0x12, 0x17, 0x1C, 0x21, //2090-2099
     };

     int[] monthNumber = {
             0x6,  //next year 1
             0x25, //next year 2
             0x0,  //3
             0x1F, //4
             0x1,  //5
             0x20, //6
             0x2,  //7
             0x21, //8
             0x4,  //9
             0x22, //10
             0x5,  //11
             0x23, //12
     };

     // 农历1900-2100的润大小信息表。 参看readme 4.1 日历实现说明
     int[] lunarInfoList = {
             0x04bd8, 0x04ae0, 0x0a570, 0x054d5, 0x0d260, 0x0d950, 0x16554, 0x056a0, 0x09ad0, 0x055d2, //1900-1909
             0x04ae0, 0x0a5b6, 0x0a4d0, 0x0d250, 0x1d255, 0x0b540, 0x0d6a0, 0x0ada2, 0x095b0, 0x14977, //1910-1919
             0x04970, 0x0a4b0, 0x0b4b5, 0x06a50, 0x06d40, 0x1ab54, 0x02b60, 0x09570, 0x052f2, 0x04970, //1920-1929
             0x06566, 0x0d4a0, 0x0ea50, 0x06e95, 0x05ad0, 0x02b60, 0x186e3, 0x092e0, 0x1c8d7, 0x0c950, //1930-1939
             0x0d4a0, 0x1d8a6, 0x0b550, 0x056a0, 0x1a5b4, 0x025d0, 0x092d0, 0x0d2b2, 0x0a950, 0x0b557, //1940-1949
             0x06ca0, 0x0b550, 0x15355, 0x04da0, 0x0a5b0, 0x14573, 0x052b0, 0x0a9a8, 0x0e950, 0x06aa0, //1950-1959
             0x0aea6, 0x0ab50, 0x04b60, 0x0aae4, 0x0a570, 0x05260, 0x0f263, 0x0d950, 0x05b57, 0x056a0, //1960-1969
             0x096d0, 0x04dd5, 0x04ad0, 0x0a4d0, 0x0d4d4, 0x0d250, 0x0d558, 0x0b540, 0x0b6a0, 0x195a6, //1970-1979
             0x095b0, 0x049b0, 0x0a974, 0x0a4b0, 0x0b27a, 0x06a50, 0x06d40, 0x0af46, 0x0ab60, 0x09570, //1980-1989
             0x04af5, 0x04970, 0x064b0, 0x074a3, 0x0ea50, 0x06b58, 0x055c0, 0x0ab60, 0x096d5, 0x092e0, //1990-1999
             0x0c960, 0x0d954, 0x0d4a0, 0x0da50, 0x07552, 0x056a0, 0x0abb7, 0x025d0, 0x092d0, 0x0cab5, //2000-2009
             0x0a950, 0x0b4a0, 0x0baa4, 0x0ad50, 0x055d9, 0x04ba0, 0x0a5b0, 0x15176, 0x052b0, 0x0a930, //2010-2019
             0x07954, 0x06aa0, 0x0ad50, 0x05b52, 0x04b60, 0x0a6e6, 0x0a4e0, 0x0d260, 0x0ea65, 0x0d530, //2020-2029
             0x05aa0, 0x076a3, 0x096d0, 0x04afb, 0x04ad0, 0x0a4d0, 0x1d0b6, 0x0d250, 0x0d520, 0x0dd45, //2030-2039
             0x0b5a0, 0x056d0, 0x055b2, 0x049b0, 0x0a577, 0x0a4b0, 0x0aa50, 0x1b255, 0x06d20, 0x0ada0, //2040-2049
             0x14b63, 0x09370, 0x049f8, 0x04970, 0x064b0, 0x168a6, 0x0ea50, 0x06b20, 0x1a6c4, 0x0aae0, //2050-2059
             0x0a2e0, 0x0d2e3, 0x0c960, 0x0d557, 0x0d4a0, 0x0da50, 0x05d55, 0x056a0, 0x0a6d0, 0x055d4, //2060-2069
             0x052d0, 0x0a9b8, 0x0a950, 0x0b4a0, 0x0b6a6, 0x0ad50, 0x055a0, 0x0aba4, 0x0a5b0, 0x052b0, //2070-2079
             0x0b273, 0x06930, 0x07337, 0x06aa0, 0x0ad50, 0x14b55, 0x04b60, 0x0a570, 0x054e4, 0x0d160, //2080-2089
             0x0e968, 0x0d520, 0x0daa0, 0x16aa6, 0x056d0, 0x04ae0, 0x0a9d4, 0x0a2d0, 0x0d150, 0x0f252, //2090-2099
             0x0d520, //2100
     };

     // 1900-2100各年的24节气日期速查表
     String[] termInfoList = {
             "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c3598082c95f8c965cc920f", "97bd0b06bdb0722c965ce1cfcc920f", "b027097bd097c36b0b6fc9274c91aa",
             "97b6b97bd19801ec9210c965cc920e", "97bcf97c359801ec95f8c965cc920f", "97bd0b06bdb0722c965ce1cfcc920f", "b027097bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e",
             "97bcf97c359801ec95f8c965cc920f", "97bd0b06bdb0722c965ce1cfcc920f", "b027097bd097c36b0b6fc9274c91aa", "9778397bd19801ec9210c965cc920e", "97b6b97bd19801ec95f8c965cc920f",
             "97bd09801d98082c95f8e1cfcc920f", "97bd097bd097c36b0b6fc9210c8dc2", "9778397bd197c36c9210c9274c91aa", "97b6b97bd19801ec95f8c965cc920e", "97bd09801d98082c95f8e1cfcc920f",
             "97bd097bd097c36b0b6fc9210c8dc2", "9778397bd097c36c9210c9274c91aa", "97b6b97bd19801ec95f8c965cc920e", "97bcf97c3598082c95f8e1cfcc920f", "97bd097bd097c36b0b6fc9210c8dc2",
             "9778397bd097c36c9210c9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c3598082c95f8c965cc920f", "97bd097bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa",
             "97b6b97bd19801ec9210c965cc920e", "97bcf97c3598082c95f8c965cc920f", "97bd097bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e",
             "97bcf97c359801ec95f8c965cc920f", "97bd097bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c359801ec95f8c965cc920f",
             "97bd097bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf97c359801ec95f8c965cc920f", "97bd097bd07f595b0b6fc920fb0722",
             "9778397bd097c36b0b6fc9210c8dc2", "9778397bd19801ec9210c9274c920e", "97b6b97bd19801ec95f8c965cc920f", "97bd07f5307f595b0b0bc920fb0722", "7f0e397bd097c36b0b6fc9210c8dc2",
             "9778397bd097c36c9210c9274c920e", "97b6b97bd19801ec95f8c965cc920f", "97bd07f5307f595b0b0bc920fb0722", "7f0e397bd097c36b0b6fc9210c8dc2", "9778397bd097c36c9210c9274c91aa",
             "97b6b97bd19801ec9210c965cc920e", "97bd07f1487f595b0b0bc920fb0722", "7f0e397bd097c36b0b6fc9210c8dc2", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e",
             "97bcf7f1487f595b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf7f1487f595b0b0bb0b6fb0722",
             "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf7f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722",
             "9778397bd097c36b0b6fc9274c91aa", "97b6b97bd19801ec9210c965cc920e", "97bcf7f1487f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa",
             "97b6b97bd19801ec9210c9274c920e", "97bcf7f0e47f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9210c91aa", "97b6b97bd197c36c9210c9274c920e",
             "97bcf7f0e47f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9210c8dc2", "9778397bd097c36c9210c9274c920e", "97b6b7f0e47f531b0723b0b6fb0722",
             "7f0e37f5307f595b0b0bc920fb0722", "7f0e397bd097c36b0b6fc9210c8dc2", "9778397bd097c36b0b70c9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721", "7f0e37f1487f595b0b0bb0b6fb0722",
             "7f0e397bd097c35b0b6fc9210c8dc2", "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721", "7f0e27f1487f595b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722",
             "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa",
             "97b6b7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0b6fb0721",
             "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9274c91aa", "97b6b7f0e47f531b0723b0787b0721", "7f0e27f0e47f531b0b0bb0b6fb0722",
             "7f0e397bd07f595b0b0bc920fb0722", "9778397bd097c36b0b6fc9210c91aa", "97b6b7f0e47f149b0723b0787b0721", "7f0e27f0e47f531b0723b0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722",
             "9778397bd097c36b0b6fc9210c8dc2", "977837f0e37f149b0723b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722", "7f0e37f5307f595b0b0bc920fb0722", "7f0e397bd097c35b0b6fc9210c8dc2",
             "977837f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e37f1487f595b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc9210c8dc2", "977837f0e37f14998082b0787b06bd",
             "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721",
             "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd097c35b0b6fc920fb0722", "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722",
             "7f0e397bd07f595b0b0bc920fb0722", "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722",
             "977837f0e37f14998082b0787b06bd", "7f07e7f0e47f149b0723b0787b0721", "7f0e27f0e47f531b0b0bb0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "977837f0e37f14998082b0723b06bd",
             "7f07e7f0e37f149b0723b0787b0721", "7f0e27f0e47f531b0723b0b6fb0722", "7f0e397bd07f595b0b0bc920fb0722", "977837f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b0721",
             "7f07e7f0e47f531b0723b0b6fb0722", "7f0e37f1487f595b0b0bb0b6fb0722", "7f0e37f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722",
             "7f0e37f1487f531b0b0bb0b6fb0722", "7f0e37f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e37f1487f531b0b0bb0b6fb0722",
             "7f0e37f0e37f14898082b072297c35", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e37f0e37f14898082b072297c35",
             "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e37f0e366aa89801eb072297c35", "7ec967f0e37f14998082b0787b06bd",
             "7f07e7f0e47f149b0723b0787b0721", "7f0e27f1487f531b0b0bb0b6fb0722", "7f0e37f0e366aa89801eb072297c35", "7ec967f0e37f14998082b0723b06bd", "7f07e7f0e47f149b0723b0787b0721",
             "7f0e27f0e47f531b0723b0b6fb0722", "7f0e37f0e366aa89801eb072297c35", "7ec967f0e37f14998082b0723b06bd", "7f07e7f0e37f14998083b0787b0721", "7f0e27f0e47f531b0723b0b6fb0722",
             "7f0e37f0e366aa89801eb072297c35", "7ec967f0e37f14898082b0723b02d5", "7f07e7f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722", "7f0e36665b66aa89801e9808297c35",
             "665f67f0e37f14898082b0723b02d5", "7ec967f0e37f14998082b0787b0721", "7f07e7f0e47f531b0723b0b6fb0722", "7f0e36665b66a449801e9808297c35", "665f67f0e37f14898082b0723b02d5",
             "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721", "7f0e36665b66a449801e9808297c35", "665f67f0e37f14898082b072297c35", "7ec967f0e37f14998082b0787b06bd",
             "7f07e7f0e47f531b0723b0b6fb0721", "7f0e26665b66a449801e9808297c35", "665f67f0e37f1489801eb072297c35", "7ec967f0e37f14998082b0787b06bd", "7f07e7f0e47f531b0723b0b6fb0721",
             "7f0e27f1487f531b0b0bb0b6fb0722", //2100
     };

     String[] number = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
     String[] ten = {"初", "十", "廿", "卅"};

     //月历月份
     String[] chineseNumber = {"正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "腊"};

     //公历每个月份的天数
     int[] monthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

     //12星座
     String[] constellation = {"魔羯", "水瓶", "双鱼", "白羊", "金牛", "双子", "巨蟹", "狮子", "处女", "天秤", "天蝎", "射手",};


     int fixSuffix(int year) {
          return year - 1900;
     }

     // 取得月历信息
     int GetLunarInfo(int year) {
          year = fixSuffix(year);
          if (year < 0 || year > lunarInfoList.length) {
               return 0;
          }
          return lunarInfoList[year];
     }

     // 返回当月「节」为几日开始
     int GetTermInfo(int year, int n) {
          year = fixSuffix(year);
          if (year < 0 || year > termInfoList.length) {
               return -1;
          }
          if (n<1 || n>24) {
               return -1;
          }
          int i = (n - 1) / 4 * 5;
          n = (n - 1) % 4;
          Integer idx = Integer.parseInt(termInfoList[year].substring(i, i + 5), 16);
          String s = idx.toString();
          String[] days = {s.substring(0,1), s.substring(1,3), s.substring(3,4), s.substring(4,6)};
          return Integer.parseInt(days[n]);
     }


     // 获取中国年
     String getChineseYear(int year){
          return StemBranchYear(year) + "年";
     }

     // 获取中国月
     String getChineseMonth(int m)  {
          if (m > 12 || m < 1) {
               return "?月";
          }
          return chineseNumber[m-1] + "月"; //加上月字
     }
     /** 中国日 */
     String getChineseDay(int d) {
          if (d < 0 || d > 31) {
               return "?日";
          }
          String s;
          switch (d) {
               case 10:
                    s = "初十";
                    break;
               case 20:
                    s = "二十";
                    break;
               case 30:
                    s = "三十";
                    break;
               default:
                    int n = (d - 1) % 10;
                    s = ten[d/10] + number[n];
                    break;
          }
          return s + "日";
     }

     // 取得干支
     String GetStemBranch(int y) {
          return heavenlyStem[y%10] + earthyBranch[y%12];
     }

     // 获取时柱
     String StemBranchHour(int y, int m, int d, int h) {
          int i = stemBranchIndex(y, m, d) % 5 * 12;
          int idx = (h + 1) / 2 % 12;
          return stemBranchTable[fixDayNext(i, idx, h)];
     }

     //待优化
     int fixDayNext(int row, int idx, int hour){
          if (hour >= 23) {
               idx += 12;
          }
          if (row+idx >= 60) {
               return row + idx - 60;
          }
          return row + idx;
     }

     int stemBranchIndex(int y, int m, int d){
          y = fixSuffix(y);
          if (y < 0 || y > yearNumber.length) {
               return 0;
          }
          if (m < 3) {
               y--;
          }
          m = (m - 1) % 12;
          return (yearNumber[y] + monthNumber[m] + d - 1) % 60;
     }
     // 获取日柱
     String StemBranchDay(int y, int m, int d){
          return stemBranchTable[stemBranchIndex(y, m, d)];
     }
     // 获取月柱
     String StemBranchMonth(int y, int m, int d){
          //月柱 1900年1月小寒以前为 丙子月(60进制12)
          int fir = GetTermInfo(y, m*2-1); //返回当月「节」为几日开始

          //依据12节气修正干支月
          String sb = GetStemBranch(fixSuffix(y)*12 + m + 11);
          if (d >= fir) {
               sb = GetStemBranch(fixSuffix(y)*12 + m + 12);
          }
          return sb;
     }

     // 获取年柱
     String StemBranchYear(int year) {
          int num = year - 4;
          return heavenlyStem[num%10] + earthyBranch[num%12];
     }

     float[]  ctable =  {4.6295f, 3.87f, 4.15f};
     float centuryCValue(int y){
          if (y > 1901 && y <= 2000) {
               return ctable[0];
          }
          if (y >= 2001 && y <= 2100) {
               return ctable[1];
          }
          if (y >= 2101 && y <= 2200) {
               return ctable[2];
          }
          return 0;
     }

     int getLiChunDay(int year)  {
          float c = centuryCValue(year);
          float y = (float)(year % 100);
          int l = (int) ((y - 1) / 4);
          return (int)((y*0.2422+c)/1 - (float)(l));
     }

     public static void main(String[] args) {
          Data test = new Data();
          int zz = test.getLiChunDay(2020);
          System.out.println(zz);
          Map<String, String> map = new HashMap<>();
     }


}

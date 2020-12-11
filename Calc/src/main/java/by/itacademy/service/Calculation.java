package by.itacademy.service;


import by.itacademy.entity.Period;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calculation {
    public static Integer calcAvarageSalary(HashMap<Period, Integer> periods, Integer year, Integer startPeriod, Integer endPeriod) {
        Integer sum = 0;
        Integer count = 0;
        for (Map.Entry<Period, Integer> entry : periods.entrySet()){
            if (entry.getKey().getYear() == year && entry.getKey().getMonth() >= startPeriod && entry.getKey().getMonth() <= endPeriod) {
                sum += entry.getValue();
                count++;
            }
        }
        return sum / count;
    }

    public static String getSalariesInString(HashMap<Period, Integer> periods, Integer year, Integer startPeriod, Integer endPeriod){
        List<Integer> salaries = new ArrayList<>();
        for (Map.Entry<Period, Integer> entry : periods.entrySet()){
            if (entry.getKey().getYear() == year && entry.getKey().getMonth() >= startPeriod && entry.getKey().getMonth() <= endPeriod) {
                salaries.add(entry.getValue());
            }
        }
        return salaries.toString();
    }
}

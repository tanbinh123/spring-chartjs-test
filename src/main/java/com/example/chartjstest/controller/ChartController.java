package com.example.chartjstest.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/chart")
@Controller
public class ChartController {
	@GetMapping
	public String getChart(Model model) {

        // timedata（テスト）
		List<LocalDateTime>timeList = new ArrayList<>();
		timeList.add(LocalDateTime.of(2020, 5, 25, 23, 57, 00));
		timeList.add(LocalDateTime.of(2020, 5, 26, 23, 57, 00));
		LocalDateTime[] timeArray = timeList.toArray(new LocalDateTime[timeList.size()]);

		//value（テスト）
		List<Integer>valueList = new ArrayList<>();
		valueList.add(1);
		valueList.add(2);
		Integer[] valueArray = valueList.toArray(new Integer[valueList.size()]);

        // Modelに格納
        model.addAttribute("timeArray",timeArray);
        model.addAttribute("valueArray",valueArray);

		return "chart";
	}

}

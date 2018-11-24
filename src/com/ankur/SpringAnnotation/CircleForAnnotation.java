package com.ankur.SpringAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;;

@Component
public class CircleForAnnotation implements ShapeAnnotation {
	
	private PointForAnnotation center;
	
	public PointForAnnotation getCenter() {
		return center;
	}
//	@Autowired
//	@Qualifier("circleRelated")
	@Resource(name="pointAnnotationC")// used for picking the bean by name
	public void setCenter(PointForAnnotation center) {
		this.center = center;
	}
	/*This was for required annotation
    @Required
	public void setCenter(PointForAnnotation center) {
		this.center = center;
	}
   */
	@PostConstruct
	public void initializeCircle(){
		System.out.println("Init of circle");
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println("Destroy of circle");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing a circle");
		System.out.println("Circle : Point is: (" + center.getX() + "," + center.getY() +")");
	}

}

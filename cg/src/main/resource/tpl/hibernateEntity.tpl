### 生成实体类
package #(table.packageNameBase);
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

#if(table.dateFlag)
import java.util.Date;
#end
#if(table.mathFlag)
import java.math.BigDecimal;
#end
#if(table.timestampFlag)
import java.sql.Timestamp;
#end

import org.hibernate.annotations.GenericGenerator;

/**
 * The persistent class for the #(table.tableName) database table.
 * 
 */
@Entity
@Table(name = "#(table.tableName)")
public class #(capitalFirstChar(hump(table.tableName))) implements Serializable {

	private static final long serialVersionUID = 1L;
	### 生成主键字段属性 
	#for(field : table.keyFields)
		@Id
		@GenericGenerator(name = "system-uuid", strategy = "uuid")
		@GeneratedValue(generator = "system-uuid")
		private #(field.javaType) #(hump(field.fieldName));
	#end
	
	### 生成普通字段属性 
	#for(field : table.commonFields)
		@Column(name = "#(field.fieldName)")
    	private #(field.javaType) #(hump(field.fieldName));
    	
	#end
	
	### 生成字段set、get方法
	#for(field : table.keyFields)
	
		public void set#(capitalFirstChar(hump(field.fieldName)))(#(field.javaType) #(hump(field.fieldName))){
			this.#(hump(field.fieldName)) = #(hump(field.fieldName));
		}
		
		public #(field.javaType) get#(capitalFirstChar(hump(field.fieldName)))(){
			return this.#(hump(field.fieldName));
		}
	#end
	#for(field : table.commonFields)
	
		public void set#(capitalFirstChar(hump(field.fieldName)))(#(field.javaType) #(hump(field.fieldName))){
			this.#(hump(field.fieldName)) = #(hump(field.fieldName));
		}
		
		public #(field.javaType) get#(capitalFirstChar(hump(field.fieldName)))(){
			return this.#(hump(field.fieldName));
		}
	#end
	
	
}
package dddd;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.cooperate.account.api.entity.AccountRecode;

public class tt {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	@Test
	public void tssss() throws IOException{
		List<AccountRecode> list = new ArrayList<>();
		AccountRecode a1 = new AccountRecode();
		a1.setId("111");
		a1.setAccountId("1233");
		
		AccountRecode a2 = new AccountRecode();
		a2.setId("5");
		
		list.add(a1);
		list.add(a2);
		System.err.println(JSON.toJSONString(list));
		
		/**
		 * 根据身份证号 判断当前用户性别（男女）
		 */
   	    String CardCode = "2301";
   	    int result1 = Integer.parseInt(CardCode.substring(16).substring(0, 1)) % 2;//截取第17位数字，除以2取摩（奇-男|偶-女）
   	    System.err.println(result1);
   	    
   	    String substring = CardCode.substring(16).substring(0, 1);
   	    System.err.println(substring);
   	    int result = Integer.parseInt(CardCode.substring(16).substring(0, 1)) % 2;//
   	    System.err.println(result);
   	    String substring2 = CardCode.substring(16);
   	    System.err.println(substring2);
	}
	
	
	

}

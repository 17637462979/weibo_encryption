
	
		
	public static String getPhoneDatas(String[] phones) {
       StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i=0; i<phones.length; i++){
            String phone = getPhoneData(phones[i]);
            stringBuilder.append(phone);
            if (i != phones.length-1) {
                stringBuilder.append(",");
            }
        }
        stringBuilder.append("]");
        System.out.println("stringBuilder = " + stringBuilder.toString());
        return stringBuilder.toString();
    }
    public static String getPhoneData(String phone) {
        String FN = phone;
        String uid = getUID(FN,phone);
        String data = "\""+"BEGIN:VCARD\\r\\nVERSION:3.0\\r\\nPRODID:Sina Weibo Sync/1.0\\r\\nUID:"+uid+"\\r\\n" +
                "FN:"+FN+"\\r\\nTEL;TYPE\\u003dcell:"+phone+"\\r\\nREV:"+getDate()+"\\r\\nEND:VCARD\\r\\n"+"\"";

        return data;
    }
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Make_service_domain_TableService_ResultScreen extends JFrame {

    JPanel jp;
    JLabel jl;
    JTextField jtf;
    JTextArea jta;
    JButton btn;
    JScrollPane scrolljta;

    String reCodeTN_LFUC; // Recode. table name, letter first upper case (LFUC) ex)abc -> Abc.

    String reCodeV1_LFUC; // Recode. Variable. Column name, letter first upper caseLFUC. ex) abc -> Abc.
    String reCodeV2_LFUC;
    String reCodeV3_LFUC;
    String reCodeV4_LFUC;
    String reCodeV5_LFUC;
    String reCodeV6_LFUC;
    String reCodeV7_LFUC;
    String reCodeV8_LFUC;
    String reCodeV9_LFUC;
    String reCodeV10_LFUC;
    String reCodeV11_LFUC;
    String reCodeV12_LFUC;
    String reCodeV13_LFUC;
    String reCodeV14_LFUC;
    String reCodeV15_LFUC;
    String reCodeV16_LFUC;
    String reCodeV17_LFUC;
    String reCodeV18_LFUC;
    String reCodeV19_LFUC;
    String reCodeV20_LFUC;
    String reCodeV21_LFUC;
    String reCodeV22_LFUC;
    String reCodeV23_LFUC;
    String reCodeV24_LFUC;
    String reCodeV25_LFUC;
    String reCodeV26_LFUC;
    String reCodeV27_LFUC;
    String reCodeV28_LFUC;
    String reCodeV29_LFUC;
    String reCodeV30_LFUC;



    public Make_service_domain_TableService_ResultScreen(String tableName, String v1, String v2, String v3, String v4, String v5, String v6, String v7, String v8, String v9, String v10, String v11, String v12, String v13, String v14, String v15, String v16, String v17, String v18, String v19, String v20, String v21, String v22, String v23, String v24, String v25, String v26, String v27, String v28, String v29, String v30, String resultValueStringAndLong1, String resultValueStringAndLong2, String resultValueStringAndLong3, String resultValueStringAndLong4, String resultValueStringAndLong5, String resultValueStringAndLong6, String resultValueStringAndLong7, String resultValueStringAndLong8, String resultValueStringAndLong9, String resultValueStringAndLong10, String resultValueStringAndLong11, String resultValueStringAndLong12, String resultValueStringAndLong13, String resultValueStringAndLong14, String resultValueStringAndLong15, String resultValueStringAndLong16, String resultValueStringAndLong17, String resultValueStringAndLong18, String resultValueStringAndLong19, String resultValueStringAndLong20, String resultValueStringAndLong21, String resultValueStringAndLong22, String resultValueStringAndLong23, String resultValueStringAndLong24, String resultValueStringAndLong25, String resultValueStringAndLong26, String resultValueStringAndLong27, String resultValueStringAndLong28, String resultValueStringAndLong29, String resultValueStringAndLong30) {
        jp = new JPanel();
        jl = new JLabel("Rally: Table Name, "+ tableName );
        jtf = new JTextField(30);
        btn = new JButton("enter");
        jta = new JTextArea(20,50);
        scrolljta = new JScrollPane(jta);

        jp.add(jl);
        jp.add(jtf);
        jp.add(btn);
        jp.add(scrolljta);
        setBounds(300,300,700,170);

        setVisible(true);
        setResizable(true);
        add(jp);

        //jta.setText("1. input\n2. View Status\n3.Turn");
        jtf.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                String jt = jtf.getText();
                if(jt.equals("1")) {
                    jta.setText("1. new instance \n2. move instance");
                }
                else if(jt.equals("3")) {
                    jta.setText("");
                }
            }
        });

        //v1, 대소문자 앞글자를 소문자로 바꾸기. 변수명.
        //v1.
        Util util = new Util();
        reCodeTN_LFUC = util.frontChangeCase(tableName);
        setTitle("service."+tableName+"."+reCodeTN_LFUC+"Service.java File.");

        if(v1.equals("")){}else{reCodeV1_LFUC = util.frontChangeCase(v1);}
        if(v2.equals("")){}else{reCodeV2_LFUC = util.frontChangeCase(v2);}
        if(v3.equals("")){}else{reCodeV3_LFUC = util.frontChangeCase(v3);}
        if(v4.equals("")){}else{reCodeV4_LFUC = util.frontChangeCase(v4);}
        if(v5.equals("")){}else{reCodeV5_LFUC = util.frontChangeCase(v5);}
        if(v6.equals("")){}else{reCodeV6_LFUC = util.frontChangeCase(v6);}
        if(v7.equals("")){}else{reCodeV7_LFUC = util.frontChangeCase(v7);}
        if(v8.equals("")){}else{reCodeV8_LFUC = util.frontChangeCase(v8);}
        if(v9.equals("")){}else{reCodeV9_LFUC = util.frontChangeCase(v9);}
        if(v10.equals("")){}else{reCodeV10_LFUC = util.frontChangeCase(v10);}
        if(v11.equals("")){}else{reCodeV11_LFUC = util.frontChangeCase(v11);}
        if(v12.equals("")){}else{reCodeV12_LFUC = util.frontChangeCase(v12);}
        if(v13.equals("")){}else{reCodeV13_LFUC = util.frontChangeCase(v13);}
        if(v14.equals("")){}else{reCodeV14_LFUC = util.frontChangeCase(v14);}
        if(v15.equals("")){}else{reCodeV15_LFUC = util.frontChangeCase(v15);}
        if(v16.equals("")){}else{reCodeV16_LFUC = util.frontChangeCase(v16);}
        if(v17.equals("")){}else{reCodeV17_LFUC = util.frontChangeCase(v17);}
        if(v18.equals("")){}else{reCodeV18_LFUC = util.frontChangeCase(v18);}
        if(v19.equals("")){}else{reCodeV19_LFUC = util.frontChangeCase(v19);}
        if(v20.equals("")){}else{reCodeV20_LFUC = util.frontChangeCase(v20);}
        if(v21.equals("")){}else{reCodeV21_LFUC = util.frontChangeCase(v21);}
        if(v22.equals("")){}else{reCodeV22_LFUC = util.frontChangeCase(v22);}
        if(v23.equals("")){}else{reCodeV23_LFUC = util.frontChangeCase(v23);}
        if(v24.equals("")){}else{reCodeV24_LFUC = util.frontChangeCase(v24);}
        if(v25.equals("")){}else{reCodeV25_LFUC = util.frontChangeCase(v25);}
        if(v26.equals("")){}else{reCodeV26_LFUC = util.frontChangeCase(v26);}
        if(v27.equals("")){}else{reCodeV27_LFUC = util.frontChangeCase(v27);}
        if(v28.equals("")){}else{reCodeV28_LFUC = util.frontChangeCase(v28);}
        if(v29.equals("")){}else{reCodeV29_LFUC = util.frontChangeCase(v29);}
        if(v30.equals("")){}else{reCodeV30_LFUC = util.frontChangeCase(v30);}

        //reCodeV1_LFUC = v1;
        //reCodeV2_LFUC = v2;
        //reCodeV3_LFUC = v3;
        //reCodeV4_LFUC = v4;
        //System.out.println("v4 값: " + v4);
        //reCodeV5_LFUC = v5;
        //reCodeV6_LFUC = v6;
        //reCodeV7_LFUC = v7;
        //reCodeV8_LFUC = v8;
        //reCodeV9_LFUC = v9;
        //reCodeV10_LFUC = v10;
        //reCodeV11_LFUC = v11;
        //reCodeV12_LFUC = v12;
        //reCodeV13_LFUC = v13;
        //reCodeV14_LFUC = v14;
        //reCodeV15_LFUC = v15;
        //reCodeV16_LFUC = v16;
        //reCodeV17_LFUC = v17;
        //reCodeV18_LFUC = v18;
        //reCodeV19_LFUC = v19;
        //reCodeV20_LFUC = v20;
        //reCodeV21_LFUC = v21;
        //reCodeV22_LFUC = v22;
        //reCodeV23_LFUC = v23;
        //reCodeV24_LFUC = v24;
        //reCodeV25_LFUC = v25;
        //reCodeV26_LFUC = v26;
        //reCodeV27_LFUC = v27;
        //reCodeV28_LFUC = v28;
        //reCodeV29_LFUC = v29;
        //reCodeV30_LFUC = v30;

//ex, PostsService
        jta.setText("// Please, Table name(camelcase and first letter lower case.).. Need first letter, Upper case. And requestDto.getnull(). That Thing. Need erase.  Then not bug. Possiible. \n"+
                        "//  " + reCodeTN_LFUC +"Service.java       File. Textting. \n"+
                        "// \n"+
                        "@RequiredArgsConstructor\n" +"@Service\n" +
                        "public class "+ reCodeTN_LFUC +"Service{\n"+
                        "private final "+ reCodeTN_LFUC +"Repository "+tableName+"Repository;\n"+
                        "\n"+
                        "@Transactional\n" +
                        "public Long save("+ reCodeTN_LFUC +"SaveRequestDto requestDto){\n"+
                        "\n"+
                        "    return "+tableName+"Repository.save(requestDto.toEntity()).get"+reCodeV1_LFUC+"Id();\n"+
                        "}\n"+
                        "\n"+
                        "@Transactional\n"+
                        "public Long update(Long id, "+ reCodeTN_LFUC +"UpdateRequestDto requestDto) {\n"+
                        "    "+ reCodeTN_LFUC +" "+tableName+" = "+tableName+"Repository.findById(id)"+"\n"+
                                ".orElseThrow(()->new IllegalArgumentException(\"No find that article. id=\"+id));\n"+
                                "\n"+
                            tableName+".update(\n"+
                            "requestDto.get"+reCodeV2_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV3_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV4_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV5_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV6_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV7_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV8_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV9_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV10_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV11_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV12_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV13_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV14_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV15_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV16_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV17_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV18_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV19_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV20_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV21_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV22_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV23_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV24_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV25_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV26_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV27_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV28_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV29_LFUC+"(),\n"+
                            "requestDto.get"+reCodeV30_LFUC+"()\n"+
                            ");\n"+
                            "return id;\n"+
                        "}\n"+
                        "\n"+
                        "@Transactional(readOnly = true)\n"+
                        "public List<"+ reCodeTN_LFUC +"ListResponseDto> findAllDesc(){\n"+
                        "     return "+ tableName+"Repository.findAllDesc().stream()\n"+
                        "               .map("+reCodeTN_LFUC+"ListResponseDto::new)\n"+
                        "               .collect(Collectors.toList());\n"+
                        "}\n"+
                        "\n"+
                        "public "+reCodeTN_LFUC+"ResponseDto findById(Long id) {\n"+
                        "       "+reCodeTN_LFUC+" entity = "+tableName+"Repository.findById(id)\n"+
                        "                   .orElseThrow(()->new IllegalArgumentException(\"No finding that article. id=\"+id));\n"+
                        "\n"+
                        "       return new "+reCodeTN_LFUC+"ResponseDto(entity);\n"+
                        "}\n"+
                        "\n"+
                        "@Transactional\n"+
                        "public void delete (Long id) {\n"+
                        "       "+reCodeTN_LFUC+" "+tableName+" = "+tableName+"Repository.findById(id)\n"+
                                ".orElseThrow(()-> new IllegalArgumentException(\"No finding that article. id=\"+id));\n"+
                                tableName+"Repository.delete("+tableName+");\n"+
                        "}\n"+
                        "}"
                );

    }
}

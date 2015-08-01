package org.shashwat.xtext.smallJava.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.shashwat.xtext.smallJava.services.SmallJavaDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSmallJavaDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'class'", "'extends'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSmallJavaDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSmallJavaDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSmallJavaDslParser.tokenNames; }
    public String getGrammarFileName() { return "../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g"; }



     	private SmallJavaDslGrammarAccess grammarAccess;
     	
        public InternalSmallJavaDslParser(TokenStream input, SmallJavaDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SmallJava";	
       	}
       	
       	@Override
       	protected SmallJavaDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:67:1: entryRuleSmallJava returns [EObject current=null] : iv_ruleSmallJava= ruleSmallJava EOF ;
    public final EObject entryRuleSmallJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmallJava = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:68:2: (iv_ruleSmallJava= ruleSmallJava EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:69:2: iv_ruleSmallJava= ruleSmallJava EOF
            {
             newCompositeNode(grammarAccess.getSmallJavaRule()); 
            pushFollow(FOLLOW_ruleSmallJava_in_entryRuleSmallJava75);
            iv_ruleSmallJava=ruleSmallJava();

            state._fsp--;

             current =iv_ruleSmallJava; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSmallJava85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSmallJava"


    // $ANTLR start "ruleSmallJava"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:76:1: ruleSmallJava returns [EObject current=null] : (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) otherlv_6= '}' ) ;
    public final EObject ruleSmallJava() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_attribute_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:79:28: ( (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) otherlv_6= '}' ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) otherlv_6= '}' )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:1: (otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) otherlv_6= '}' )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:80:3: otherlv_0= 'class' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_attribute_5_0= ruleAttribute ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleSmallJava122); 

                	newLeafNode(otherlv_0, grammarAccess.getSmallJavaAccess().getClassKeyword_0());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSmallJavaAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSmallJavaRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:102:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:102:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSmallJava157); 

                        	newLeafNode(otherlv_2, grammarAccess.getSmallJavaAccess().getExtendsKeyword_2_0());
                        
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:106:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:107:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:107:1: (otherlv_3= RULE_ID )
                    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:108:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getSmallJavaRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSmallJava177); 

                    		newLeafNode(otherlv_3, grammarAccess.getSmallJavaAccess().getParentSmallJavaCrossReference_2_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleSmallJava191); 

                	newLeafNode(otherlv_4, grammarAccess.getSmallJavaAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:123:1: ( (lv_attribute_5_0= ruleAttribute ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:124:1: (lv_attribute_5_0= ruleAttribute )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:124:1: (lv_attribute_5_0= ruleAttribute )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:125:3: lv_attribute_5_0= ruleAttribute
            {
             
            	        newCompositeNode(grammarAccess.getSmallJavaAccess().getAttributeAttributeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAttribute_in_ruleSmallJava212);
            lv_attribute_5_0=ruleAttribute();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSmallJavaRule());
            	        }
                   		set(
                   			current, 
                   			"attribute",
                    		lv_attribute_5_0, 
                    		"Attribute");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleSmallJava224); 

                	newLeafNode(otherlv_6, grammarAccess.getSmallJavaAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSmallJava"


    // $ANTLR start "entryRuleAttribute"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:153:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:154:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:155:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute260);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute270); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:162:1: ruleAttribute returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:165:28: ( ( (lv_name_0_0= RULE_ID ) ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:166:1: ( (lv_name_0_0= RULE_ID ) )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:166:1: ( (lv_name_0_0= RULE_ID ) )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:167:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:167:1: (lv_name_0_0= RULE_ID )
            // ../org.shashwat.xtext.smallJava/src-gen/org/shashwat/xtext/smallJava/parser/antlr/internal/InternalSmallJavaDsl.g:168:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAttribute311); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSmallJava_in_entryRuleSmallJava75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSmallJava85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleSmallJava122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava139 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleSmallJava157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSmallJava177 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSmallJava191 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleSmallJava212 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSmallJava224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute311 = new BitSet(new long[]{0x0000000000000002L});

}
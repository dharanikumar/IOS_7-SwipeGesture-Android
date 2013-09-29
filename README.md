IOS_7-SwipeGesture-Android
==========================

IOS 7 Swipe Gesture in Android listview. This repo provides listview swipe gesture pattern like IOS7 mailbox. messages to your Application.

Please note that this swipe gesture pattern possible in side Relativelayout. Because the action options appears at background of listview item.


## Supported Views
      * RelativeLayout
      

##Usage

### Two Options at ListItem Background
ListView cmn_list_view	            =	(ListView) findViewById(R.id.cmn_list_view);               //Listview
ListViewSwipeGesture touchListener  = new ListViewSwipeGesture(cmn_list_view, swipeListener, this);

touchListener.SwipeType	            =	ListViewSwipeGesture.Double;    //Set two options at background of list item, Default
	/* These are optional --- Begins*/
	
		//attributes for first action
		touchListener.HalfColor       	=	getResources().getString(R.string.str_green);
		touchListener.HalfText	        =	getResources().getString(R.string.basic_action_1);
		touchListener.HalfDrawable	    =	getResources().getDrawable(R.drawable.rating_favorite);
		
		//attributes for second action
		touchListener.HalfColor	        =	getResources().getString(R.string.str_orange);
		touchListener.HalfText	        =	getResources().getString(R.string.basic_action_2);
		touchListener.HalfDrawable	    =	getResources().getDrawable(R.drawable.rating_good);
		
		/* ------ End ------ */
		
		cmn_list_view.setOnTouchListener(touchListener);
		

### Dismiss option
ListView cmn_list_view	=	(ListView) findViewById(R.id.cmn_list_view);               //Listview

ListViewSwipeGesture touchListener = new ListViewSwipeGesture(cmn_list_view, swipeListener, this);
		touchListener.SwipeType	=	ListViewSwipeGesture.Dismiss;
		cmn_list_view.setOnTouchListener(touchListener);
		
### Swipe Gesture Callback functions
ListViewSwipeGesture.TouchCallbacks swipeListener = new ListViewSwipeGesture.TouchCallbacks() {

		@Override
		public void FullSwipeListView(int position) {
			// Call back function for second action
		}

		@Override
		public void HalfSwipeListView(int position) {
			// Call back function for first option
		}

		@Override
		public void LoadDataForScroll(int count) {
			// call back function to load more data in listview (Continuous scroll)
			
			
		}

		@Override
		public void onDismiss(ListView listView, int[] reverseSortedPositions) {
			// Call back function to delete list item
		}

		@Override
		public void OnClickListView(int position) {
			// Call back function for onclick action
		}
		
	};

